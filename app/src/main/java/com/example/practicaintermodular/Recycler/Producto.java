package com.example.practicaintermodular.Recycler;

public class Producto {
    private int id;
    private String descripcion;
    private double stockAnual;
    private double PVP;
    ///////////////////////////////////////////////////
    public Producto(int id, String descripcion, double stockAnual, double PVP) {
        this.id = id;
        this.descripcion = descripcion;
        this.stockAnual = stockAnual;
        this.PVP = PVP;
    }
    ///////////////////////////////////////////////////
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    ///////////////////////////////////////////////////
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    ///////////////////////////////////////////////////
    public double getStockAnual() {
        return stockAnual;
    }
    public void setStockAnual(double stockAnual) {
        this.stockAnual = stockAnual;
    }
    ///////////////////////////////////////////////////
    public double getPVP() {
        return PVP;
    }
    public void setPVP(double PVP) {
        this.PVP = PVP;
    }
    ///////////////////////////////////////////////////
}
