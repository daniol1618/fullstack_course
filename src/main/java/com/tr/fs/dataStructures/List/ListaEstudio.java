package com.tr.fs.dataStructures.List;

import com.tr.fs.dataStructures.List.model.Genero;
import com.tr.fs.dataStructures.List.model.Persona;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ListaEstudio {

    public static List<Persona> generarListaPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Daniel", 33, Genero.MASCULINO));
        personas.add(new Persona("Natalia", 13, Genero.FEMENINO));
        personas.add(new Persona("Felipe", 43, Genero.MASCULINO));
        personas.add(new Persona("Vanessa", 23, Genero.FEMENINO));
        personas.add(new Persona("Pedro", 73, Genero.NOINFORMA));

        return personas;
    }

    public Stream<Persona> obtenerPersonasOrdenadasPorNombre() {
        return generarListaPersonas().stream()
                .sorted(Comparator.comparing(Persona::getNombre));
    }

    public Stream<Persona> obtenerPersonasOrdenadasPorEdadReversed() {
        return generarListaPersonas().stream()
                .sorted(Comparator.comparing(Persona::getEdad).reversed());
    }
}
