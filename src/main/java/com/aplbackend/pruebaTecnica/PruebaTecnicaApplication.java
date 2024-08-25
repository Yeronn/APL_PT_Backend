package com.aplbackend.pruebaTecnica;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aplbackend.pruebaTecnica.modelo.Permission;
import com.aplbackend.pruebaTecnica.repositorio.UsuarioRepositorio;

@SpringBootApplication
public class PruebaTecnicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaApplication.class, args);
	}


	@Bean
	CommandLineRunner init(UsuarioRepositorio usuarioRepositorio) {
		return args -> {
			Permission createPermission = Permission.builder().name("").build();
		};
	}

}
