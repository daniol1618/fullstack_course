package com.tr.fs.streams;

import com.tr.fs.model.Genero;
import com.tr.fs.model.Persona;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsStudio {

    public List<Persona> estudioStreams() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Daniel", 33, Genero.MASCULINO));
        personas.add(new Persona("Natalia", 13, Genero.FEMENINO));
        personas.add(new Persona("Felipe", 43, Genero.MASCULINO));
        personas.add(new Persona("Vanessa", 23, Genero.FEMENINO));
        personas.add(new Persona("Pedro", 73, Genero.NOINFORMA));

        return personas;
    }

    public Stream<Persona> obtenerPersonasOrdenadasPorNombre() {
        return estudioStreams().stream()
                .sorted(Comparator.comparing(Persona::getNombre));
    }

    public Stream<Persona> obtenerPersonasOrdenadasPorEdadReversed() {
        return estudioStreams().stream()
                .sorted(Comparator.comparing(Persona::getEdad).reversed());
    }
}
