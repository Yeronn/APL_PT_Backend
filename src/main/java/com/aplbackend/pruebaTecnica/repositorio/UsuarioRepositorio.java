package com.aplbackend.pruebaTecnica.repositorio;

import java.util.List;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aplbackend.pruebaTecnica.modelo.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    List<Usuario> findByState(boolean state);
    Optional<Usuario> findByName(String name);
}
