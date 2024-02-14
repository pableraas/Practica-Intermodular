package com.example.practicaintermodular;

public class Producto {

    private int id;
    private String descripcion;
    private int stockAnual;
    private double PVP;


    public Producto(int id, String descripcion, int stockAnual, double PVP) {
        this.id = id;
        this.descripcion = descripcion;
        this.stockAnual = stockAnual;
        this.PVP = PVP;
    }
}
