package com.tr.fs.dataStructures.vectoresFijos;

public class ArreglosTradicionales {

    private static final int nuevoNumero = 9;

    public static void main(String[] args) {

        /**
         * Vector Tradicional
         */
        int[] numerosVector = {1, 2, 3, 4, 5};

        System.out.println("--- IMPRIMIR TODOS LOS ELEMENTOS ---");
        for (int i = 0; i < numerosVector.length; i++) {
            System.out.println(numerosVector[i]);
        }

        System.out.println("--- IMPRIMIR ELEMENTO EN POSICION 2 ---");
        System.out.println(numerosVector[2]);

        System.out.println("--- MODIFICAR ELEMENTO EN POSICION 2 POR UN 9 ---");
        for (Integer i : numerosVector) {
            if (i == 2) {
                numerosVector[2] = nuevoNumero;
            }
        }
        for (int i = 0; i < numerosVector.length; i++) {
            System.out.println(numerosVector[i]);
        }

        System.out.println("--- AGREGAR UN ELEMENTO AL FINAL DEL ARREGLO --- RESTRICCION!");
        //LA OPERACION NO ES DESEADA PARA ESTE TIPO DE ESTRUCTURA DE DATOS PUES ES INEFICIENTE


        /**
         * Arreglo de dos dimensiones
         */
        int[][] arregloBiDimensional = new int[2][2];
        arregloBiDimensional[0][0] = 1;
        arregloBiDimensional[0][1] = 2;
        arregloBiDimensional[1][0] = 3;
        arregloBiDimensional[1][1] = 4;

        System.out.println("--- ARREGLO BI-DIMENSIONAL ---");
        for (int i = 0; i < arregloBiDimensional.length; i++) {
            for (int j = 0; j < arregloBiDimensional.length; j++) {
                System.out.println("(X" + i + ",Y" + j + "): " + arregloBiDimensional[i][j]);
            }
        }

        System.out.println("--- MODIFICAR ELEMENTO EN POSICION X0,Y0 POR UN 9 ---");
        for (int i = 0; i < arregloBiDimensional.length; i++) {
            for (int j = 0; j < arregloBiDimensional.length; j++) {
                if (i == 1 && j == 1) {
                    arregloBiDimensional[i][j] = nuevoNumero;
                }
            }
        }
        System.out.println("--- NUEVO ARREGLO BI-DIMENSIONAL ---");
        for (int i = 0; i < arregloBiDimensional.length; i++) {
            for (int j = 0; j < arregloBiDimensional.length; j++) {
                System.out.println("(X" + i + ",Y" + j + "): " + arregloBiDimensional[i][j]);
            }
        }
        System.out.println("--- AGREGAR UN ELEMENTO AL FINAL DEL ARREGLO --- RESTRICCION!");
        //LA OPERACION NO ES DESEADA PARA ESTE TIPO DE ESTRUCTURA DE DATOS PUES ES INEFICIENTE

    }
}
