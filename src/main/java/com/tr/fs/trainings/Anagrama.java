package com.tr.fs.trainings;

import java.util.*;

/**
 * 4. Anagram Checker:
 * Create a function to check if two strings are anagrams of each other
 * (contain the same characters but in a different order).
 */
public class Anagrama {

    private boolean esAnagrama(String textoIzquierda, String textoDerecha) {
        textoIzquierda = textoIzquierda.toLowerCase();
        textoDerecha = textoDerecha.toLowerCase();

        List<String> listaIzquierda = new ArrayList<>(List.of(textoIzquierda.split("")));
        List<String> listaDerecha = new ArrayList<>(List.of(textoDerecha.split("")));

        Collections.sort(listaIzquierda);
        Collections.sort(listaDerecha);

        return listaIzquierda.equals(listaDerecha);
    }

    public static void main(String[] args) {
        Anagrama anagrama = new Anagrama();
        boolean esAnagrama = anagrama.esAnagrama("PENERAPA", "PEPERANA");

        if (esAnagrama) {
            System.out.println("Sip, es un anagrama");
        } else {
            System.out.println("Nop, no es un anagrama");
        }
    }
}
