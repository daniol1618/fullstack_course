package com.tr.fs.poo.interfaces;

public interface IAnimal {

    Integer cantidadCuidadores = 10;

    String hacerSonido();

    default void comerAlimentos() {
        System.out.println("Yummy Yummy, comiendo alimentos");
    }
}
