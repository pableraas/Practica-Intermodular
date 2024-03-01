package com.example.practicaintermodular.ModelosDeDatos;

public class Producto {
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer stockAnual;
    private Double pvp;

    // Constructor vacío es necesario para la deserialización de JSON
    public Producto() {}

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Integer getStockAnual() { return stockAnual; }
    public void setStockAnual(Integer stockAnual) { this.stockAnual = stockAnual; }

    public Double getPvp() { return pvp; }
    public void setPvp(Double pvp) { this.pvp = pvp; }
}

