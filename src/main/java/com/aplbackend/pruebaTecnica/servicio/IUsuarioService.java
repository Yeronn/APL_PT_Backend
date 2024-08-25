package com.aplbackend.pruebaTecnica.servicio;

import java.util.List;

import com.aplbackend.pruebaTecnica.modelo.Usuario;

public interface IUsuarioService {

    Usuario crearUsuario(Usuario usuario);
    List<Usuario> obtenerUsuariosActivos();
    void desactivarUsuario(Long usuarioId);
    // Usuario cambiarRolUsuario(Long usuarioId, String nuevoRol);
    // Usuario buscarUsuario(Long id);
    // Long borrarUsuario(Long id);
}
