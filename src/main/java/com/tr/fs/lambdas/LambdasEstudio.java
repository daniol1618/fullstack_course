package com.tr.fs.lambdas;

import com.tr.fs.model.Genero;
import com.tr.fs.model.Persona;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdasEstudio {

    /**
     * Estudio de Funcion Lambda con la implementación de un metodo de una interfaz llamada Calculadora
     *
     * @return el valor de la tasa multiplicado por el monto del credito
     */
    public BigDecimal calculosEstudio() {
        /*Calculadora calculadora = new Calculadora() {
            @Override
            public BigDecimal calcularTasaInteres(BigDecimal monto, BigDecimal tasa) {
                return monto.multiply(tasa);
            }
        };*/

        Calculadora calculadora = (x, y) -> {
            return x.multiply(y);
        };
        return calculadora.calcularTasaInteres(BigDecimal.TEN, BigDecimal.ONE);
    }


    public void sortElements() {

        ArrayList<String> nombresPersonas = new ArrayList<>(List.of("Gabriela", "Myriam", "Yaneth", "Fernando"));
        ArrayList<Integer> enteros = new ArrayList<>(List.of(5, 4, 6, 2, 9, 44));

        List<Persona> personas = new ArrayList<>(
                List.of(
                        new Persona("Daniel", 32, Genero.NOINFORMA),
                        new Persona("Francis", 35, Genero.FEMENINO),
                        new Persona("Caroline", 3, Genero.FEMENINO)
                )
        );

        nombresPersonas.sort((a, b) -> {
            return a.compareTo(b);
        });

        enteros.sort((a, b) -> {
            return a.compareTo(b);
        });


        personas.sort((a, b) -> {
            return a.getEdad().compareTo(b.getEdad());
        });

        /*System.out.println("Nombres Personas" + "\n" + nombresPersonas);
        System.out.println("Enteros" + "\n" + enteros);
        System.out.println("Personas:" + "\n" + personas);
        */

        //Ahora, utilizando el ordenamiento de la Clase Collections
        ArrayList<String> nombresPersonas2 = new ArrayList<>(List.of("Gabriela", "Myriam", "Yaneth", "Fernando"));
        ArrayList<Integer> enteros2 = new ArrayList<>(List.of(5, 4, 6, 2, 9, 44));

        List<Persona> personas2 = new ArrayList<>(
                List.of(
                        new Persona("Daniel", 32, Genero.NOINFORMA),
                        new Persona("Francis", 35, Genero.FEMENINO),
                        new Persona("Caroline", 3, Genero.FEMENINO)
                )
        );

        Collections.sort(nombresPersonas2, (a, b) -> {
            return a.compareTo(b);
        });

        Collections.sort(enteros2);

        Collections.sort(personas2, (a, b) -> {
            return a.getNombre().compareTo(b.getNombre());
        });

        //Preparacion para el Binay Search
        ArrayList<String> nombresPersonas3 = new ArrayList<>(List.of("Gabriela", "Myriam", "Yaneth", "Fernando"));
        ArrayList<Integer> enteros3 = new ArrayList<>(List.of(5, 4, 6, 2, 9, 44));

        List<Persona> personas3 = new ArrayList<>(
                List.of(
                        new Persona("Daniel", 32, Genero.NOINFORMA),
                        new Persona("Francis", 35, Genero.FEMENINO),
                        new Persona("Caroline", 3, Genero.FEMENINO)
                )
        );

        Collections.sort(nombresPersonas3);
        System.out.println(nombresPersonas3);
        String elementoABuscar = "Yaneth";
        int posicionElementoEncontrado = Collections.binarySearch(nombresPersonas3, elementoABuscar);
        System.out.println(
                "Elemento a Buscar: " + elementoABuscar +
                        " ,Posicion Elemento encontrado: " + posicionElementoEncontrado);

        Collections.reverse(nombresPersonas);
        System.out.println(nombresPersonas);

        System.out.println(enteros3);
        Collections.shuffle(enteros3);
        System.out.println(enteros3);
        //2,5,6,4,44,9

        Collections.swap(enteros3, 0,1);
        System.out.println(enteros3);

        Collections.fill(enteros3,44);
        System.out.println(enteros3);
    }

    public static void main(String[] args) {
        LambdasEstudio lambdasEstudio = new LambdasEstudio();
        lambdasEstudio.sortElements();
    }
}
