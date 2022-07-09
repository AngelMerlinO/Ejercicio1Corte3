//212255 Ortega Merlin Jose Angel 2-B
package com.upchiapas;

import com.upchiapas.models.Libro;

import com.upchiapas.models.Operaciones;
import com.upchiapas.models.Revista;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        byte op;
        double numerolibro = 0;
        Operaciones ope= new Operaciones(numerolibro);
        ArrayList<Libro> libros = new ArrayList<Libro>();
        ArrayList<Revista> revistas = new ArrayList<Revista>();
    do{
            System.out.println("1.registro ");
            System.out.println("2.imprimir libros");
            System.out.println("3.cambio de status libro ");
            System.out.println("4. salir ");
            System.out.println("ingrese una opcion ");
             op = entrada.nextByte();


            switch (op) {

                case 1:
                    System.out.println("registrar libro =1 revista = 2");
                    byte opc = entrada.nextByte();
                    if (opc == 1) {
                        System.out.println("registro de libro");
                        System.out.println("ingrese el codigo de libro ");
                        double codigolibro = entrada.nextDouble();
                        System.out.println("ingrese el titulo del libro ");
                        String titulo = entrada.nextLine();
                        titulo = entrada.nextLine();
                        System.out.println("ingresa el año de publicacion");
                        double añopublicacion = entrada.nextDouble();
                        boolean status = false;
                        Libro libro = new Libro(codigolibro,titulo,añopublicacion,status);
                        libros.add(libro);



                    }else {
                        System.out.println("registro de Revista");
                        System.out.println("ingrese el codigo de la revista  ");
                        double codigolibro = entrada.nextDouble();
                        System.out.println("ingrese el titulo  de la revista® ");
                        String titulo = entrada.nextLine();
                        titulo = entrada.nextLine();
                        System.out.println("ingresa el año de publicacion");
                        double añopublicacion = entrada.nextDouble();
                        boolean status =false;
                        Revista revista = new Revista(codigolibro,titulo,añopublicacion,status);
                        revistas.add(revista);
                    }
                    break;
                case 2:
                    System.out.println("impirmir libros = 1| Revistas = 2");
                    byte opci = entrada.nextByte();
                    if (opci==1){
                        ope.imprimirLibro(libros);
                    }else {
                        ope.imprimirRevita(revistas);
                    }
                    break;
                case 3:
                    System.out.println("ingrese el codigo del libro ");
                    numerolibro = entrada.nextDouble();
                    for (int i = 0; i < libros.size(); i++){
                        if (numerolibro == libros.get(i).getCodigolibro()) {
                            System.out.println("selecione una opcion");
                            System.out.println("1= prestar|2=devolver|3=prestado");
                            byte selec =entrada.nextByte();
                            switch (selec){
                                case 1:
                                    ope.prestar(numerolibro,libros);
                                    break;
                                case 2:
                                    ope.devolver(numerolibro,libros);
                                    break;
                                case 3:
                                    ope.prestado(numerolibro,libros);
                                    break;
                            }
                        }else{
                            System.out.println("ingrese la un numero valido");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Vuelve pronto");
                    System.out.println("BY JOSE ANGEL ORTEGA MERLIN ");
                    System.exit(1);
                    break;
                default:
                    throw new AssertionError();
            }
        }while (op != 4);

    }

}
