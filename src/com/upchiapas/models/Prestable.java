package com.upchiapas.models;

import java.util.ArrayList;

public interface Prestable {
    public void prestar();

    void prestar(double numerolibro, ArrayList<Libro> libros);

    public void devolver();

    void devolver(double numerolibro, ArrayList<Libro> libros);

    public  boolean prestado();

    boolean prestado(double numerolibro, ArrayList<Libro> libros);
}
