package com.tr.fs.poo.interfaces;

public interface IAnimal {

    String hacerSonido();

    default void comerAlimentos() {
        System.out.println("Yummy Yummy, comiendo alimentos");
    }
}
