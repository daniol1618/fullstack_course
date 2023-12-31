package com.tr.fs.poo.anonimas;

/**
 * Una clase anónima en Java es una clase sin nombre que se define y se instancia al mismo tiempo.
 * Se utiliza comúnmente para implementar interfaces o clases abstractas en el lugar
 * donde se necesitan, sin crear una clase separada.
 */
public class Cuadrado {

    public static void main(String[] args) {
        Double lado = 8.00;
        //1. Esta es la implementacion de la clase anonima convertida en una lambda function
        IFigura figura = (a) -> Math.pow(a, 2);
        System.out.println(figura.calcularArea(lado));

        //2. Otro ejemplo de la conversion, esto no puede hacerse porque existe mas de un metodo abstracto definido en la interfaz
        //IPrinter printer = () -> System.out.println("Soy la Impresora");
        //printer.saludoDeBienvenida();

        IPrinter printer = new IPrinter() {
            @Override
            public void saludoDeBienvenida() {
                System.out.println("Hola Cuadrado");
            }

            @Override
            public Integer numeroDeHojas() {
                return 10;
            }
        };
        printer.saludoDeBienvenida();
        System.out.println("tengo: " + printer.numeroDeHojas() + " hojas");
    }
}
