package com.tr.fs.reflection;

import lombok.Data;

@Data
public class Electrodomestico {
    private String nombre;
    private Tipo tipo;

    public Electrodomestico(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
}

enum Tipo {
    ELECTRICO, GAS;
}
