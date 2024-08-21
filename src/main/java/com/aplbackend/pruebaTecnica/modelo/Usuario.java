package com.aplbackend.pruebaTecnica.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= Usuario.TABLE_NAME)
public class Usuario {
    
    public static final String TABLE_NAME = "usuario";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuarioId;

    private String nombre;
    private String email;
    private String rol;
    private boolean estado;

    public Usuario() {
    }

    public Usuario(int usuarioId, String nombre, String email, String rol, boolean estado) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
        this.estado = estado;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario [usuarioId=" + usuarioId + ", nombre=" + nombre + ", email=" + email + ", rol=" + rol
                + ", estado=" + estado + "]";
    }
}
