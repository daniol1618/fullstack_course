package com.tr.fs.dataStructures.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * A Red-Black tree based NavigableMap implementation. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
 */
public class TreeMapEstudio {

    public TreeMap<Integer, String> estudioListas() {
        TreeMap<Integer, String> mapaAlumnosTree = new TreeMap<>();
        mapaAlumnosTree.put(11, "Natalia");
        mapaAlumnosTree.put(13, "Fernanda");
        mapaAlumnosTree.put(12, "Giovanna");
        mapaAlumnosTree.put(8, "Natasha");
        mapaAlumnosTree.put(99, "Flor");
        mapaAlumnosTree.put(1, "Patroclo");
        return mapaAlumnosTree;
    }

    public static void main(String[] args) {
        TreeMapEstudio mapEstudioArbol = new TreeMapEstudio();
        TreeMap<Integer, String> mapaEstudiantes = mapEstudioArbol.estudioListas();

        System.out.println(mapaEstudiantes);

    }
}
