package com.rueda;

public class Digital extends Recurso {

    private String extension;
    private double pesoMB;

    public Digital(String codigo, String nombre, String extension, double pesoMB) {
        super(codigo, nombre);
        this.extension = extension;
        this.pesoMB = pesoMB;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Digital");
        System.out.println("Formato: " + extension);
        System.out.println("Tamaño: " + pesoMB + " MB");
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getPesoMB() {
        return pesoMB;
    }

    public void setPesoMB(double pesoMB) {
        this.pesoMB = pesoMB;
    }
}