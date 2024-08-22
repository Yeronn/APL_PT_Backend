package com.aplbackend.pruebaTecnica.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = VentaProducto.TABLE_NAME)
public class VentaProducto {

    public static final String TABLE_NAME = "ventaProducto";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ventaProductoId;

    @ManyToOne
    @JoinColumn(name = "ventaId")
    private Venta ventaId;

    @ManyToOne
    @JoinColumn(name = "productoId")
    private Producto productoId;
    
    private int cantidad;
    
    public VentaProducto() {
    }
    public VentaProducto(Long ventaProductoId, Venta ventaId, Producto productoId, int cantidad) {
        this.ventaProductoId = ventaProductoId;
        this.ventaId = ventaId;
        this.productoId = productoId;
        this.cantidad = cantidad;
    }
    
    public Long getVentaProductoId() {
        return ventaProductoId;
    }
    public void setVentaProductoId(Long ventaProductoId) {
        this.ventaProductoId = ventaProductoId;
    }
    public Venta getVentaId() {
        return ventaId;
    }
    public void setVentaId(Venta ventaId) {
        this.ventaId = ventaId;
    }
    public Producto getProductoId() {
        return productoId;
    }
    public void setProductoId(Producto productoId) {
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
