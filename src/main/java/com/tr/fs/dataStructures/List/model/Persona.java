package com.tr.fs.dataStructures.List.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    private String nombre;
    private Integer edad;
    private Genero genero;

}
