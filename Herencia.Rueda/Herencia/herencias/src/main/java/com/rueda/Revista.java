package com.rueda;

public class Revista extends Recurso {

    private String mesPublicacion;
    private int numeroEdicion;

    public Revista(String codigo, String nombre, String mesPublicacion, int numeroEdicion) {
        super(codigo, nombre);
        this.mesPublicacion = mesPublicacion;
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Revista");
        System.out.println("Mes: " + mesPublicacion);
        System.out.println("Edición: " + numeroEdicion);
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
}
