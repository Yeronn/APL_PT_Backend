package com.aplbackend.pruebaTecnica.controlador;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SaludoController {

    @GetMapping("/saludo/{param}")
    public String holaMundo(String param) {
        return "Hola mundo";
    }
    
}
