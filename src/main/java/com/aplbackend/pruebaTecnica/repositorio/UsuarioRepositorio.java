package com.aplbackend.pruebaTecnica.repositorio;

import java.util.List;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aplbackend.pruebaTecnica.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    List<Usuario> findByEstado(boolean estado);
    Optional<Usuario> findByNombre(String nombre);
}
