package com.example.practicaintermodular.ModelosDeDatos;

import java.util.Date;

public class Venta {
    private Long idVenta;
    private Date fechaVenta;
    private Cliente cliente;
    private Producto producto;
    private Integer cantidad;

    // Constructor vacío
    public Venta() {}

    // Getters y setters
    public Long getIdVenta() { return idVenta; }
    public void setIdVenta(Long idVenta) { this.idVenta = idVenta; }

    public Date getFechaVenta() { return fechaVenta; }
    public void setFechaVenta(Date fechaVenta) { this.fechaVenta = fechaVenta; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
}

