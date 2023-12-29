package com.tr.fs.poo.interfaces;

public class Delfin implements IAnimal {


    @Override
    public String hacerSonido() {
        return "Yip yip yip";
    }

    @Override
    public void comerAlimentos() {
        System.out.println("Comiendo peces...");
    }
}
