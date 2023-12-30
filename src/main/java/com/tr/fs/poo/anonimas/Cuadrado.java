package com.tr.fs.poo.anonimas;

/**
 * Una clase anónima en Java es una clase sin nombre que se define y se instancia al mismo tiempo.
 * Se utiliza comúnmente para implementar interfaces o clases abstractas en el lugar
 * donde se necesitan, sin crear una clase separada.
 */
public class Cuadrado {

    public static void main(String[] args) {

        //Esta es la implementacion de la clase anonima
        IFigura figura = new IFigura() {
            @Override
            public Double calcularArea() {
                Double lado = 10.00;
                return Math.pow(lado, 2);
            }
        };

        System.out.println(figura.calcularArea());
    }

}
