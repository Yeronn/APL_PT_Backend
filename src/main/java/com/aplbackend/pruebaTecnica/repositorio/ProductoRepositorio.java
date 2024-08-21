package com.aplbackend.pruebaTecnica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplbackend.pruebaTecnica.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

}
