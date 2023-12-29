package com.tr.fs.poo.abstractas;

public class Runner {

    public static void main(String[] args) {
        Cat gato = new Cat();
        Dog perro = new Dog();

        gato.hacerSonido();
        perro.hacerSonido();

        gato.comerAlimentos();
        perro.comerAlimentos();

        //Animal animal = new Animal(); No se puede hacer esto en una clase abstracta
    }
}
