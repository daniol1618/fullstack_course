package com.tr.fs.poo;

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
