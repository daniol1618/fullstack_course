package com.tr.fs.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona {

    private String nombre;
    private Integer edad;
    private Genero genero;

}

