package com.tr.fs.poo;

public class Runner {

    public static void main(String[] args) {
        Cat gato = new Cat();
        Dog perro = new Dog();

        gato.hacerSonido();
        perro.hacerSonido();

        gato.comerAlimentos();
        perro.comerAlimentos();
    }
}
