package com.tr.fs.poo.abstractas;

public class Cat extends Animal{
    @Override
    public String hacerSonido() {
        return "Meow";
    }

    @Override
    public void comerAlimentos() {
        System.out.println("Estoy comiendo pezcado");
    }
}
