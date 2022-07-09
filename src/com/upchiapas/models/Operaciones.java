package com.upchiapas.models;

import java.util.ArrayList;

public class Operaciones implements Prestable{
    private  double numerolibro;

    public Operaciones(double numerolibro) {
        this.numerolibro = numerolibro;
    }

    public void imprimirLibro (ArrayList<Libro> libros){
        for (int i=0;i<libros.size();i++){
            System.out.println(libros.get(i));
        }
    }
    public void imprimirRevita (ArrayList<Revista> revistas ){
        for (int i=0;i<revistas.size();i++){
            System.out.println(revistas.get(i));
        }
    }

    @Override
    public void prestar() {

    }

    @Override
    public void prestar(double numerolibro, ArrayList<Libro> libros) {
        for (int i=0; i< libros.size();i++)
            if (numerolibro== libros.get(i).getCodigolibro()){
                libros.get(i).setPrestado(true);
            }

    }

    @Override
    public void devolver() {

    }

    @Override
    public void devolver(double numerolibro, ArrayList<Libro> libros) {
        for (int i=0; i< libros.size();i++)
            if (numerolibro== libros.get(i).getCodigolibro()){
                libros.get(i).setPrestado(false);
            }

    }

    @Override
    public boolean prestado() {
        return false;
    }

    @Override
    public boolean prestado(double numerolibro, ArrayList<Libro> libros) {
        boolean status = false;
        for (int i=0; i< libros.size();i++)
            if (numerolibro== libros.get(i).getCodigolibro()){
                status=libros.get(i).isPrestado();
            }
        
        return status;
    }
}
