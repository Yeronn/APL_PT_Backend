package com.aplbackend.pruebaTecnica.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = Venta.TABLE_NAME)
public class Venta {

    public static final String TABLE_NAME = "venta";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ventaId;

    private int usuarioId;
    private String fechaVenta;
    private float totalVenta;
    
    public Venta() {
    }
    public Venta(int ventaId, int usuarioId, String fechaVenta, float totalVenta) {
        this.ventaId = ventaId;
        this.usuarioId = usuarioId;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
    }
    
    public int getVentaId() {
        return ventaId;
    }
    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }
    public int getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
    public String getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public float getTotalVenta() {
        return totalVenta;
    }
    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Venta [ventaId=" + ventaId + ", usuarioId=" + usuarioId + ", fechaVenta=" + fechaVenta + ", totalVenta="
                + totalVenta + "]";
    }
}
