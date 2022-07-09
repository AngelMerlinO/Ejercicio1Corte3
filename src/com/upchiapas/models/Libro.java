package com.upchiapas.models;

import java.util.ArrayList;

public class Libro {
    private double codigolibro;
    private String titulo;
    private double añopublicacion;
    private boolean prestado;

    public Libro(double codigolibro, String titulo, double añopublicacion, boolean prestado) {
        this.codigolibro = codigolibro;
        this.titulo = titulo;
        this.añopublicacion = añopublicacion;
        this.prestado = prestado;
    }

    public double getCodigolibro() {
        return codigolibro;
    }

    public void setCodigolibro(double codigolibro) {
        this.codigolibro = codigolibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAñopublicacion() {
        return añopublicacion;
    }

    public void setAñopublicacion(double añopublicacion) {
        this.añopublicacion = añopublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return " Libro: " +
                " codigolibro: " + codigolibro  + "\n"+
                " titulo: " + titulo +"\n"+
                " añopublicacion: " + añopublicacion +"\n"+
                " prestado: " + prestado +"\n"+"----------------------------------";
    }
}

