package com.tr.fs.functionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

/**
 * En Java, el método `.filter()` forma parte de la API de Streams introducida en Java 8. Este método acepta un predicado como argumento,
 * lo que significa que toma una función que devuelve un valor booleano (verdadero o falso) y filtra los elementos del flujo en consecuencia.
 * Por ejemplo, si tienes un flujo de números y quieres filtrar solo los números pares, puedes usar `.filter()` junto con un predicado
 * que compruebe si un número es par. Aquí hay un ejemplo básico:
 * .filter(numero -> numero % 2 == 0)
 * En este caso, el `.filter()` toma el predicado `numero -> numero % 2 == 0`, que verifica si un número es divisible por 2 (es decir, si es par).
 * Solo los números que cumplan esta condición se incluirán en el nuevo flujo `pares`.
 */
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

    private List<Integer> operarNumerosPares() {
        List<Integer> elementos = new ArrayList<>(List.of(1, 6, 2, 3, 4, 5, 6, 7, 9));

        return elementos.stream()
                .filter(a -> a % 2 == 0)
                .map(a -> a * 10).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ClaseFuncional claseFuncional = new ClaseFuncional();
        System.out.println("Ejercicio 1:");
        System.out.println(claseFuncional.obtenerElementosEnLista());
        System.out.println("Tamano del arreglo " + claseFuncional.obtenerElementosEnLista().size());

        System.out.println("\n");
        System.out.println("Ejercicio 2: ");
        System.out.println(claseFuncional.operarNumerosPares());
    }
}
