package com.tr.fs.dataStructures;

import com.tr.fs.model.Genero;
import com.tr.fs.model.Persona;

import java.util.*;

/**
 * A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element. As implied by its name, this interface models the mathematical set abstraction.
 */
public class SortedSetEstudio {

    public SortedSet<Persona> estudioListas() {
        SortedSet<Persona> personas = new TreeSet<>(Comparator.comparing(Persona::getEdad)); // SortedSet implementation of Set
        personas.add(new Persona("Daniel", 33, Genero.MASCULINO));
        personas.add(new Persona("Natalia", 13, Genero.FEMENINO));
        personas.add(new Persona("Felipe", 43, Genero.MASCULINO));
        personas.add(new Persona("Vanessa", 23, Genero.FEMENINO));
        personas.add(new Persona("Pedro", 73, Genero.NOINFORMA));
        return personas;
    }

    public static void main(String[] args) {
        SortedSetEstudio hashSetEstudio = new SortedSetEstudio();
        SortedSet<Persona> setPersonas = hashSetEstudio.estudioListas();

        System.out.println("--- SET ORIGINAL ---");
        setPersonas.forEach(System.out::println);

        System.out.println("--- TAMAÑO SET ---");
        int tamano = setPersonas.size();
        System.out.println(tamano);

        System.out.println("--- ADICIONAR PERSONA YAMILA---");
        setPersonas.add(new Persona("Yamila", 22, Genero.NOINFORMA));
        setPersonas.forEach(System.out::println);

        System.out.println("--- ADICIONAR NUEVAMENTE PERSONA YAMILA---");
        setPersonas.add(new Persona("Yamila", 22, Genero.NOINFORMA));
        setPersonas.forEach(System.out::println);

        boolean yamila = setPersonas.contains(new Persona("Yamila", 22, Genero.NOINFORMA));
        System.out.println(yamila);
    }
}
