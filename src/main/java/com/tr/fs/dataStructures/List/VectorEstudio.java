package com.tr.fs.dataStructures.List;

import com.tr.fs.dataStructures.List.model.Genero;
import com.tr.fs.dataStructures.List.model.Persona;

import java.util.Vector;

/**
 * The Vector class implements a growable array of objects.
 * Like an array, it contains components that can be accessed using an integer index.
 * However, the size of a Vector can grow or shrink as needed to accommodate adding and removing
 * items after the Vector has been created.
 */
public class VectorEstudio {


    public void estudioVector() {

        Vector vectorPersonas = new Vector();
        vectorPersonas.add(new Persona("Camila", 13, Genero.FEMENINO));
        vectorPersonas.add(new Persona("Fernando", 14, Genero.MASCULINO));
        vectorPersonas.add(new Persona("Natalia", 15, Genero.FEMENINO));
        vectorPersonas.add(new Persona("Giovanni", 12, Genero.MASCULINO));

        System.out.println("-----VECTOR INICIAL-----");
        vectorPersonas.forEach(System.out::println);

        System.out.println("-----ADICIONAR PERSONA EN INDICE 0-----");
        vectorPersonas.add(0, new Persona("Gerard", 55, Genero.NOINFORMA));
        vectorPersonas.forEach(System.out::println);

        System.out.println("-----ELEMENTO EN POSICION 3-----");
        System.out.println(vectorPersonas.elementAt(3));

        System.out.println("-----PRIMER ELEMENTO-----");
        System.out.println(vectorPersonas.firstElement());

        System.out.println("-----HASHCODE-----");
        System.out.println(vectorPersonas.hashCode());

        System.out.println("-----INDICE DE CAMILA-----");
        System.out.println(vectorPersonas.indexOf(new Persona("Camila", 13, Genero.FEMENINO)));

        System.out.println("-----REMOVER EN POSICION 0-----");
        System.out.println(vectorPersonas.remove(0));

        System.out.println("-----MODIFICAR EN POSICION 0-----");
        System.out.println(vectorPersonas.set(0, new Persona("Ferdinand", 33, Genero.MASCULINO)));

        System.out.println("-----VECTOR FINAL-----");
        vectorPersonas.forEach(System.out::println);
    }

    public static void main(String[] args) {
        VectorEstudio vectorEstudio = new VectorEstudio();
        vectorEstudio.estudioVector();
    }

}
