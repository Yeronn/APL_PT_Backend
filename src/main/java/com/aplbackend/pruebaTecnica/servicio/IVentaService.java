package com.aplbackend.pruebaTecnica.servicio;

import java.util.List;

import com.aplbackend.pruebaTecnica.modelo.Venta;

public interface IVentaService {
    Venta registrarVenta(String nombreComprador, float totalCompra);
    List<Venta> obtenerVentas();
}
