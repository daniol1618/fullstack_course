package com.tr.fs.poo.interfaces;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Delfin:");
        Delfin delfin = new Delfin();
        System.out.println(delfin.hacerSonido());
        delfin.comerAlimentos();

        System.out.println("\n" + "Camello sin override del metodo default:");
        Camell camell = new Camell();
        System.out.println(camell.hacerSonido());
        camell.comerAlimentos();
    }
}
