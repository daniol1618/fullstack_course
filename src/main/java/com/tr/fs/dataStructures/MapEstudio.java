package com.tr.fs.dataStructures;

import java.util.*;

/**
 * An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.c
 */
public class MapEstudio {

    public HashMap<Integer, String> estudioListas() {
        HashMap<Integer, String> mapaAlumnos = new HashMap();
        mapaAlumnos.put(1989909, "Natalia");
        mapaAlumnos.put(2089909, "Fernanda");
        mapaAlumnos.put(1089909, "Patricio");
        return mapaAlumnos;
    }

    public static void main(String[] args) {
        MapEstudio mapEstudio = new MapEstudio();
        HashMap<Integer, String> mapaEstudiantes = mapEstudio.estudioListas();
        System.out.println(mapaEstudiantes);

        String nombreEstudiante = mapaEstudiantes.get(1989909);
        System.out.println("ESTUDIANTE CON LLAVE: 1989909 -> " + nombreEstudiante);

        mapaEstudiantes.put(1989909, "Yamila");
        System.out.println("NUEVO MAPA -> " + mapaEstudiantes);

        System.out.println("TAMANO DEL MAPA " + mapaEstudiantes.size());

        boolean yamila = mapaEstudiantes.containsValue("Yamila");
        System.out.println("EXISTE YAMILA? " + yamila);

        Collection<String> cadenaValores = mapaEstudiantes.values();
        System.out.println(cadenaValores);
    }
}
