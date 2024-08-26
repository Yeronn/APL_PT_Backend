package com.aplbackend.pruebaTecnica;

import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aplbackend.pruebaTecnica.modelo.Permission;
import com.aplbackend.pruebaTecnica.modelo.Role;
import com.aplbackend.pruebaTecnica.modelo.RoleEnum;
import com.aplbackend.pruebaTecnica.modelo.Usuario;
import com.aplbackend.pruebaTecnica.repositorio.UsuarioRepositorio;

@SpringBootApplication
public class PruebaTecnicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsuarioRepositorio usuarioRepositorio) {
		return args -> {
			Permission createUserPermission = Permission.builder()
					.name("CREATEUSER")
					.build();

			Permission desactivateUserPermission = Permission.builder()
					.name("DESACTIVATEUSER")
					.build();

			Permission changeRolPermission = Permission.builder()
					.name("CHANGEROL")
					.build();

			Permission registerSalePermission = Permission.builder()
					.name("REGISTERSALE")
					.build();

			Permission getActiveUserPermission = Permission.builder()
					.name("GETACTIVEUSER")
					.build();

			Permission getSalesPermission = Permission.builder()
					.name("GETSALES")
					.build();

			Role roleAdmin = Role.builder()
					.roleEnum(RoleEnum.ADMIN)
					.permissionList(Set.of(createUserPermission, desactivateUserPermission, changeRolPermission, registerSalePermission, getActiveUserPermission, getSalesPermission))
					.build();
			
			Role roleAnalyst = Role.builder()
					.roleEnum(RoleEnum.ANALYST)
					.permissionList(Set.of(getActiveUserPermission, getSalesPermission))
					.build();

			Role roleUser = Role.builder()
					.roleEnum(RoleEnum.USER)
					.permissionList(Set.of(registerSalePermission, getSalesPermission))
					.build();

			Usuario userSantiago = Usuario.builder()
																		.username("santiago")
																		.password("1234")
																		.isEnabled(true)
																		.accountNoExpired(true)
																		.accountNoLocked(true)
																		.credentialsNoExpired(true)
																		.roles(Set.of(roleAdmin))
																		.email("example1@example.com")
																		.name("santiago")
																		.build();

			Usuario userDaniel = Usuario.builder()
																		.username("daniel")
																		.password("1234")
																		.isEnabled(true)
																		.accountNoExpired(true)
																		.accountNoLocked(true)
																		.credentialsNoExpired(true)
																		.roles(Set.of(roleUser))
																		.email("example2@example.com")
																		.name("daniel")
																		.build();

			Usuario userAndrea = Usuario.builder()
																		.username("andrea")
																		.password("1234")
																		.isEnabled(true)
																		.accountNoExpired(true)
																		.accountNoLocked(true)
																		.credentialsNoExpired(true)
																		.roles(Set.of(roleAnalyst))
																		.email("example3@example.com")
																		.name("andrea")
																		.build();

			usuarioRepositorio.saveAll(List.of(userAndrea, userDaniel, userSantiago));
		};
	}

}
