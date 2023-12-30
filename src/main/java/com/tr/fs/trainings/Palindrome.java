package com.tr.fs.trainings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create a function that checks if a given string
 * is a palindrome (reads the same forward and backward).
 */
public class Palindrome {

    private boolean esPalindrome(String texto) {

        //1. Convertir de String a Lista
        List<String> listaOrdenada = List.of(texto.split(""));

        //2. Copiar la lista ordenada dentro de otra lista
        List<String> listaReversada = new ArrayList<>();
        listaReversada.addAll(listaOrdenada);

        //3.Reversar la lista
        Collections.reverse(listaReversada);

        //4.Checkear el resultado
        System.out.println(listaReversada);
        System.out.println(listaOrdenada);

        //5.Comparar
        if (listaOrdenada.equals(listaReversada)) {
            System.out.println("Iguales");
            return true;
        } else {
            System.out.println("Diferentes");
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.esPalindrome("anna"));

    }
}
