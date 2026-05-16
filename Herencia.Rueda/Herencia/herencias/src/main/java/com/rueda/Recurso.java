package com.rueda;

public class Recurso {

    protected String codigo;
    protected String nombre;
    protected boolean estadoDisponible;

    public Recurso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estadoDisponible = true;
    }

    public void mostrarInfo() {
        System.out.println("---------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Estado: " + (estadoDisponible ? "Disponible" : "Prestado"));
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }
}