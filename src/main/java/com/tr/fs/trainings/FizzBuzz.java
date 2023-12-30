package com.tr.fs.trainings;

import java.util.ArrayList;

/**
 * 1. FizzBuzz:
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three, print "Fizz" instead of the number,
 * and for the multiples of five, print "Buzz".
 * For numbers that are multiples of both three and five, print "FizzBuzz".
 */
public class FizzBuzz {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList();
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);

            if (i % 3 == 0 && i % 5 == 0) {
                lista.add("FizzBuzz: " + i);
            } else if (i % 3 == 0) {
                lista.add("Fizz: " + i);
            } else if (i % 5 == 0) {
                lista.add("Buzz: " + i);
            } else {
                lista.add("Nada: " + i);
            }
        }

        System.out.println(lista);
    }
}
