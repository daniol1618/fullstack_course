package com.tr.fs.designPrinciples.solid.substitucionLiskov.correct;

interface Figura {
    int calcularArea();
}

class Rectangulo implements Figura {
    protected int ancho;
    protected int alto;

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public int calcularArea() {
        return ancho * alto;
    }
}

class Cuadrado implements Figura {
    private int lado;

    public void setSide(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularArea() {
        return lado * lado;
    }
}

