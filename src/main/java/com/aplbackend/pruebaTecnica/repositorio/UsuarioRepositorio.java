package com.aplbackend.pruebaTecnica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplbackend.pruebaTecnica.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
