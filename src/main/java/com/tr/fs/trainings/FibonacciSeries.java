package com.tr.fs.trainings;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Fibonacci Series:
 * Write a function to generate the Fibonacci sequence up to a certain number 'n'.
 * The Fibonacci sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on,
 * where each number is the sum of the two preceding ones.
 */
public class FibonacciSeries {

    private void fibonacciSeriesHasta(int limite) {
        List<Integer> elementos = new ArrayList<>();

        int prev = 0;
        int next = 1;
        int res = 0;

        elementos.add(prev);
        elementos.add(next);

        while (res < limite) {
            res = prev + next;
            elementos.add(res);
            prev = next;
            next = res;

            if (res > limite){
                elementos.remove(elementos.size()-1);
                break;
            }
        }
        System.out.println(elementos);
    }


    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.fibonacciSeriesHasta(100);
    }
}
