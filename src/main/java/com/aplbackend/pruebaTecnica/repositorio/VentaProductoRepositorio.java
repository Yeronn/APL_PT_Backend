package com.aplbackend.pruebaTecnica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplbackend.pruebaTecnica.modelo.VentaProducto;

public interface VentaProductoRepositorio extends JpaRepository<VentaProducto, Integer> {

}
