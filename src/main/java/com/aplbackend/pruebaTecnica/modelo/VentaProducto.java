package com.aplbackend.pruebaTecnica.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = VentaProducto.TABLE_NAME)
public class VentaProducto {

    public static final String TABLE_NAME = "ventaProducto";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ventaProductoId;

    private int ventaId;
    private int productoId;
    private int cantidad;
    
    public VentaProducto() {
    }
    public VentaProducto(int ventaProductoId, int ventaId, int productoId, int cantidad) {
        this.ventaProductoId = ventaProductoId;
        this.ventaId = ventaId;
        this.productoId = productoId;
        this.cantidad = cantidad;
    }
    
    public int getVentaProductoId() {
        return ventaProductoId;
    }
    public void setVentaProductoId(int ventaProductoId) {
        this.ventaProductoId = ventaProductoId;
    }
    public int getVentaId() {
        return ventaId;
    }
    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }
    public int getProductoId() {
        return productoId;
    }
    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "VentaProducto [ventaProductoId=" + ventaProductoId + ", ventaId=" + ventaId + ", productoId="
                + productoId + ", cantidad=" + cantidad + "]";
    }
}
