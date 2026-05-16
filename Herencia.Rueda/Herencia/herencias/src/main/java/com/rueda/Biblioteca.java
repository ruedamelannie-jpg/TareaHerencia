package com.rueda;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Recurso> listaRecursos;

    public Biblioteca() {
        listaRecursos = new ArrayList<>();
    }

    public void agregar(Recurso obj) {
        listaRecursos.add(obj);
    }

    public void mostrarTodo() {
        System.out.println("\n LISTADO COMPLETO DE RECURSOS\n");
        for (Recurso r : listaRecursos) {
            r.mostrarInfo();
        }
    }

    public Recurso buscarCodigo(String codigo) {
        for (Recurso r : listaRecursos) {
            if (r.getCodigo().equals(codigo)) {
                return r;
            }
        }
        return null;
    }

    public void mostrarSoloLibros() {
        System.out.println("\n SOLO LIBROS:\n");
        for (Recurso r : listaRecursos) {
            if (r instanceof Libro) {
                r.mostrarInfo();
            }
        }
    }
}