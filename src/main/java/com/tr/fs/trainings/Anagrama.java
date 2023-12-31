package com.tr.fs.trainings;

import java.util.*;
import java.util.stream.Collector;

/**
 * 4. Anagram Checker:
 * Create a function to check if two strings are anagrams of each other
 * (contain the same characters but in a different order).
 */
public class Anagrama {

    private boolean esAnagrama() {
        String textoIzquierda = "casa";
        String textoDerecha = "saxa";


        List<String> listaIzquierda = new ArrayList<>(List.of(textoIzquierda.split("")));
        List<String> listaDerecha = new ArrayList<>(List.of(textoDerecha.split("")));

        String actual = null;
        String temp = null;

        if (listaIzquierda.size() != listaDerecha.size()) {
            System.out.println("El tamano de los arreglos es diferente");
            return false;
        }

        for (int i = 0; i < listaIzquierda.size(); i++) {
            for (int j = 0; j < listaDerecha.size(); j++) {
                actual = listaIzquierda.get(i);
                temp = listaDerecha.get(j);

                if (actual.equals(temp)) {
                    listaIzquierda.set(i, "x");
                    break;
                } else {

                }
            }
        }
        //System.out.println(listaIzquierda);

        for (int i = listaIzquierda.size() - 1; i >= 0; i--) {
            //System.out.println(i);
            if (listaIzquierda.get(i).equals("x")) {
                listaIzquierda.remove(i);
            }
        }


        //System.out.println(listaIzquierda);
        return listaIzquierda.isEmpty();
    }

    public static void main(String[] args) {
        Anagrama anagrama = new Anagrama();

        if(anagrama.esAnagrama()){
            System.out.println("Sip, es un anagrama");
        } else {
            System.out.println("Nop, no es un anagrama");
        }
        //System.out.println(anagrama.esAnagrama());
    }
}
