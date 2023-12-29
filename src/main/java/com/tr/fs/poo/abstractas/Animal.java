package com.tr.fs.poo.abstractas;

//Las clases Abstractas son clases que pueden o no tener metodos abstractos o concretos
public abstract class Animal {


    public abstract String hacerSonido();

    public void comerAlimentos() {
        System.out.println("MMM, comiendo alimentos");
    }
}
