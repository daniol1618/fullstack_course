package com.tr.fs.designPrinciples.solid.substitucionLiskov.incorrect;

class Rectangulo {
    protected int ancho;
    protected int alto;

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int calcularArea() {
        return ancho * alto;
    }
}

class Cuadrado extends Rectangulo {
    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
        this.alto = ancho;
    }

    @Override
    public void setAlto(int alto) {
        this.alto = alto;
        this.ancho = alto;
    }
}

//Todo: En este escenario, la clase cuadrado hereda de Rectangulo.
// Sin embargo, para asegurar que la propiedad del cuadrado en donde cada lado es igual,
// Los setters en Cuadrado sobreescriben el comportamiento de la clase padre Rectangulo.
// El sobreescribir el padre viola the Principio de sustitucion de liskov, pues cambia el
// comportamiento esperado de la superclase.
