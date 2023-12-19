package com.tr.fs.solid.segregacionInterfaces.correct;

interface Impresora {
    void imprimir(String documento);
}

interface Escaner {
    void escanear(String documento);
}

interface Fax {
    void fax(String documento);
}

class ImpresoraSimple implements Impresora {
    @Override
    public void imprimir(String documento) {
        // Logic to print documento
    }
}

class EscanerSimple implements Escaner {
    @Override
    public void escanear(String documento) {
        // Logic to scan documento
    }
}