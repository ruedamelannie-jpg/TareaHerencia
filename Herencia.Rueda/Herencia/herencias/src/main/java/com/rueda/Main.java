package com.rueda;

public class Main {
    public static void main(String[] args) {

        System.out.println("Proyecto realizado por Victoria Rueda");
        System.out.println("Sistema Biblioteca usando Herencia\n");

        Biblioteca sistema = new Biblioteca();

        Libro l1 = new Libro("LB10", "Don Quijote", "Miguel de Cervantes", 863);
        Revista rv1 = new Revista("RV22", "Muy Interesante", "Abril", 180);
        Digital dg1 = new Digital("DG05", "Manual de Java", "PDF", 9.6);

        sistema.agregar(l1);
        sistema.agregar(rv1);
        sistema.agregar(dg1);

        sistema.mostrarTodo();

        sistema.mostrarSoloLibros();

        System.out.println("\n Buscando código RV22...");
        Recurso encontrado = sistema.buscarCodigo("RV22");

        if (encontrado != null) {
            System.out.println("Se encontró el recurso:");
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró el recurso.");
        }
    }
}