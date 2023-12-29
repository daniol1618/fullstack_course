package com.tr.fs.functionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class ClaseFuncional {

    private Set<String> obtenerElementosEnLista() {

        String text = "Java, java renowned for its its object-oriented paradigm, robustness, and platform platform " +
                "independence through its virtual machine, is is extensively utilized in in " +
                "diverse domains from enterprise-level systems " +
                "to to embedded devices and and web web development.";

        String[] arreglo = text.split(" ");

        Set<String> lista = new HashSet<>(List.of(arreglo));

        return lista.stream()
                .filter(a -> (!Objects.equals(a, "")))
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        ClaseFuncional claseFuncional = new ClaseFuncional();
        System.out.println(claseFuncional.obtenerElementosEnLista());
        System.out.println("Tamano del arreglo " + claseFuncional.obtenerElementosEnLista().size());

    }
}
