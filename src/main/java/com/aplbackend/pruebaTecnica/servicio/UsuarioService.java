package com.aplbackend.pruebaTecnica.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplbackend.pruebaTecnica.modelo.Usuario;
import com.aplbackend.pruebaTecnica.repositorio.UsuarioRepositorio;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public List<Usuario> obtenerUsuariosActivos() {
        return usuarioRepositorio.findByEstado(true);
    }

    @Override
    public void desactivarUsuario(Long usuarioId) {
        Usuario usuario = usuarioRepositorio.findById(usuarioId)
                                            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuario.setEstado(false);
        usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario cambiarRolUsuario(Long usuarioId, String nuevoRol) {
        Usuario usuario = usuarioRepositorio.findById(usuarioId)
                                            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuario.setRol(nuevoRol);
        return usuarioRepositorio.save(usuario);
    }
}
