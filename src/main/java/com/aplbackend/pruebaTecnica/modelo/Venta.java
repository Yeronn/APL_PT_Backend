package com.aplbackend.pruebaTecnica.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = Venta.TABLE_NAME)
public class Venta {

    public static final String TABLE_NAME = "venta";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ventaId;

    @ManyToOne
    @JoinColumn(name = "usuarioId")
    private Usuario usuarioId;

    private String fechaVenta;
    private float totalVenta;
    
    public Venta() {
    }
    public Venta(Long ventaId, Usuario usuarioId, String fechaVenta, float totalVenta) {
        this.ventaId = ventaId;
        this.usuarioId = usuarioId;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
    }
    
    public Long getVentaId() {
        return ventaId;
    }
    public void setVentaId(Long ventaId) {
        this.ventaId = ventaId;
    }
    public Usuario getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Usuario usuarioId) {
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
