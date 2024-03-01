package com.example.practicaintermodular.ModelosDeDatos;

public class Cliente {
    private Long id;
    private String nombre;
    private String direccion;
    private String poblacion;
    private String telef;
    private String nif;

    // Constructor vacío
    public Cliente() {}

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getPoblacion() { return poblacion; }
    public void setPoblacion(String poblacion) { this.poblacion = poblacion; }

    public String getTelef() { return telef; }
    public void setTelef(String telef) { this.telef = telef; }

    public String getNif() { return nif; }
    public void setNif(String nif) { this.nif = nif; }
}

