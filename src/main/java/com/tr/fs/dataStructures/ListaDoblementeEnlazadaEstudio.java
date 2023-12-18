package com.tr.fs.dataStructures;

import com.tr.fs.model.Genero;
import com.tr.fs.model.Persona;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Doubly-linked list implementation of the List and Deque interfaces. Implements all optional list operations, and permits all elements (including null).
 */
public class ListaDoblementeEnlazadaEstudio {

    public LinkedList<Persona> estudioListas() {
        LinkedList<Persona> personas = new LinkedList<>(); //Implements the Linked List Interface
        personas.add(new Persona("Daniel", 33, Genero.MASCULINO));
        personas.add(new Persona("Natalia", 13, Genero.FEMENINO));
        personas.add(new Persona("Felipe", 43, Genero.MASCULINO));
        personas.add(new Persona("Vanessa", 23, Genero.FEMENINO));
        personas.add(new Persona("Pedro", 73, Genero.NOINFORMA));
        return personas;
    }

    public static void main(String[] args) {
        ListaDoblementeEnlazadaEstudio listaEstudio = new ListaDoblementeEnlazadaEstudio();
        LinkedList<Persona> listaPersonas = listaEstudio.estudioListas();


        System.out.println("--- LISTA ORIGINAL ---");
        listaPersonas.forEach(System.out::println);

        System.out.println("--- TAMAÑO LISTA ---");
        int tamano = listaPersonas.size();
        System.out.println(tamano);

        /*Retrieves, but does not remove, the head (first element) of this list.*/
        System.out.println("--- OBTIENE EL ELEMENTO DE LA CABEZA SIN REMOVERLO ---: " + listaPersonas.element());
        listaPersonas.forEach(System.out::println);

        /*Adds the specified element as the tail (last element) of this list.*/
        System.out.println("--- ADICIONA PERSONA A LA COLA DE LA LISTA ---: " + listaPersonas.offer(new Persona("Nueva Cola", 33, Genero.NOINFORMA)));
        listaPersonas.forEach(System.out::println);

        /*Inserts the specified element at the front of this list.*/
        System.out.println("--- ADICIONA PERSONA A LA CABEZA DE LA LISTA ---: " + listaPersonas.offerFirst(new Persona("Nueva Cabeza", 22, Genero.NOINFORMA)));
        listaPersonas.forEach(System.out::println);
    }
}
