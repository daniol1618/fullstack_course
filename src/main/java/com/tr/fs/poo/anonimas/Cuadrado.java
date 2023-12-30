package com.tr.fs.poo.anonimas;

/**
 * Una clase anónima en Java es una clase sin nombre que se define y se instancia al mismo tiempo.
 * Se utiliza comúnmente para implementar interfaces o clases abstractas en el lugar
 * donde se necesitan, sin crear una clase separada.
 */
public class Cuadrado {

    public static void main(String[] args) {
        Double lado = 8.00;
        //Esta es la implementacion de la clase anonima convertida en una lambda function
        IFigura figura = (a) -> Math.pow(a, 2);
        System.out.println(figura.calcularArea(lado));
    }
}
