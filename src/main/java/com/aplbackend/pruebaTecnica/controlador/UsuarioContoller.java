package com.aplbackend.pruebaTecnica.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aplbackend.pruebaTecnica.modelo.Usuario;
import com.aplbackend.pruebaTecnica.servicio.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@PreAuthorize("denyAll()")
public class UsuarioContoller {

    @Autowired
    private UsuarioService usuarioServicio;

    @PostMapping("/crear")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioServicio.crearUsuario(usuario);
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/activos")
    public List<Usuario> obtenerUsuariosActivos() {
        return usuarioServicio.obtenerUsuariosActivos();
    }

    @PutMapping("/desactivar/{id}")
    public void desactivarUsuario(@PathVariable Long id) {
        usuarioServicio.desactivarUsuario(id);
    }

    // @PutMapping("/cambiarRol/{id}")
    // public Usuario cambiarRolUsuario(@PathVariable Long id, @RequestParam String nuevoRol) {
    //     return usuarioServicio.cambiarRolUsuario(id, nuevoRol);
    // }

}
