package com.tr.fs.lambdas;

import java.math.BigDecimal;

public class LambdasEstudio {

    /**
     * Estudio de Funcion Lambda con la implementación de un metodo de una interfaz llamada Calculadora
     *
     * @return el valor de la tasa multiplicado por el monto del credito
     */
    public BigDecimal calculosEstudio() {
        /*Calculadora calculadora = new Calculadora() {
            @Override
            public BigDecimal calcularTasaInteres(BigDecimal monto, BigDecimal tasa) {
                return monto.multiply(tasa);
            }
        };*/

        Calculadora calculadora = (x, y) -> {
            return x.multiply(y);
        };
        return calculadora.calcularTasaInteres(BigDecimal.TEN, BigDecimal.ONE);
    }

    public static void main(String[] args) {
        LambdasEstudio lambdasEstudio = new LambdasEstudio();
        System.out.println(lambdasEstudio.calculosEstudio());
    }

}
