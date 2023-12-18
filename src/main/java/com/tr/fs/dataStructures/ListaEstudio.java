package com.tr.fs.dataStructures;

import com.tr.fs.model.Genero;
import com.tr.fs.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class ListaEstudio {

    public List<Persona> estudioListas() {
        List<Persona> personas = new ArrayList<>(); //Implements the ArrayList Interface
        personas.add(new Persona("Daniel", 33, Genero.MASCULINO));
        personas.add(new Persona("Natalia", 13, Genero.FEMENINO));
        personas.add(new Persona("Felipe", 43, Genero.MASCULINO));
        personas.add(new Persona("Vanessa", 23, Genero.FEMENINO));
        personas.add(new Persona("Pedro", 73, Genero.NOINFORMA));
        return personas;
    }

    public static void main(String[] args) {
        ListaEstudio listaEstudio = new ListaEstudio();
        List<Persona> listaPersonas = listaEstudio.estudioListas();


        System.out.println("--- LISTA ORIGINAL ---");
        listaPersonas.forEach(System.out::println);

        System.out.println("--- TAMAÑO LISTA ---");
        int tamano = listaPersonas.size();
        System.out.println(tamano);

        System.out.println("--- ELEMENTO EN POSICION 1 ---");
        Persona persona = listaPersonas.get(1);
        System.out.println(persona);

        System.out.println("--- ADICIONAR PERSONA YAMILA---");
        listaPersonas.add(new Persona("Yamila", 22, Genero.NOINFORMA));
        listaPersonas.forEach(System.out::println);
    }
}
