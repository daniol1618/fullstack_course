package com.tr.fs.trainings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1. FizzBuzz:
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three, print "Fizz" instead of the number,
 * and for the multiples of five, print "Buzz".
 * For numbers that are multiples of both three and five, print "FizzBuzz".
 */
public class FizzBuzz {

    public static void main(String[] args) {

        /*ArrayList<String> lista = new ArrayList();
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
        */

        /*IntStream.rangeClosed(1, 100)
                .mapToObj((i) -> {
                    if (i % 3 == 0 && i % 5 == 0) {
                        return ("FizzBuzz: " + i);
                    } else if (i % 3 == 0) {
                        return ("Fizz: " + i);
                    } else if (i % 5 == 0) {
                        return ("Buzz: " + i);
                    } else {
                        return ("Nada: " + i);
                    }
                })
                .forEach(System.out::println);
                */

        IntStream.rangeClosed(1, 100).forEach((i) -> {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz: " + i);
            } else {
                System.out.println("Nada: " + i);
            }
        });
    }
}
