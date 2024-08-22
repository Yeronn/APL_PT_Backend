package com.aplbackend.pruebaTecnica.controlador;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class SaludoController {

    @GetMapping("/saludo/{param}")
    public String holaMundo(@PathVariable String param) {
        return "Hola mundo " + param;
    }
    
}
