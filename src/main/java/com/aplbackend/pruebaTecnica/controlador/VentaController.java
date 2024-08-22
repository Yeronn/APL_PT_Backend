package com.aplbackend.pruebaTecnica.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.aplbackend.pruebaTecnica.modelo.Venta;
import com.aplbackend.pruebaTecnica.servicio.VentaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @GetMapping("/listar")
    public List<Venta> obtenerVentas() {
        return ventaService.obtenerVentas();
    }

    @PostMapping("/registrar")
    public Venta registrarVenta(@RequestParam String nombreComprador,
                                @RequestParam float totalCompra) {
        return ventaService.registrarVenta(nombreComprador, totalCompra);
    }
}
