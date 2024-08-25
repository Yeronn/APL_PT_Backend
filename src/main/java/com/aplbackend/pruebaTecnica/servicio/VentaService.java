package com.aplbackend.pruebaTecnica.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.aplbackend.pruebaTecnica.modelo.Usuario;
import com.aplbackend.pruebaTecnica.modelo.Venta;
import com.aplbackend.pruebaTecnica.repositorio.UsuarioRepositorio;
import com.aplbackend.pruebaTecnica.repositorio.VentaRepositorio;
import java.time.LocalDate;

@Service
public class VentaService implements IVentaService{

    @Autowired
    private VentaRepositorio ventaRepositorio;

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Venta> obtenerVentas() {
        return ventaRepositorio.findAll();
    }

    @Override
    public Venta registrarVenta(String nombreComprador, float totalCompra) {
        Usuario comprador = usuarioRepositorio.findByName(nombreComprador).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Venta nuevaVenta = new Venta();
        nuevaVenta.setUsuario(comprador);
        nuevaVenta.setFechaVenta(LocalDate.now());
        nuevaVenta.setTotalVenta(totalCompra);

        return ventaRepositorio.save(nuevaVenta);
    }
}
