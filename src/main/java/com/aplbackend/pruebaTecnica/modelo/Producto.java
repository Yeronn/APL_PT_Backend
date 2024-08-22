package com.aplbackend.pruebaTecnica.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= Producto.TABLE_NAME)
public class Producto {

    public static final String TABLE_NAME = "producto";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;

    private String nombreProducto;
    private float precio;

    public Producto() {
    }
    public Producto(Long productoId, String nombreProducto, float precio) {
        this.productoId = productoId;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }
    
    public Long getProductoId() {
        return productoId;
    }
    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Producto [productoId=" + productoId + ", nombreProducto=" + nombreProducto + ", precio=" + precio + "]";
    }

    
}
