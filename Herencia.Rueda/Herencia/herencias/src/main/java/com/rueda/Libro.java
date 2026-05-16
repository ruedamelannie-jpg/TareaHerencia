package com.rueda;

public class Libro extends Recurso {

    private String escritor;
    private int numPaginas;

    public Libro(String codigo, String nombre, String escritor, int numPaginas) {
        super(codigo, nombre);
        this.escritor = escritor;
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Libro");
        System.out.println("Autor: " + escritor);
        System.out.println("Páginas: " + numPaginas);
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}