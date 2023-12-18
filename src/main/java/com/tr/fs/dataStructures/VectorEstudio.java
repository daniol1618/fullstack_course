package com.tr.fs.dataStructures;

import com.tr.fs.model.Genero;
import com.tr.fs.model.Persona;

import java.util.Vector;

/**
 * The Vector class implements a growable array of objects.
 * Like an array, it contains components that can be accessed using an integer index.
 * However, the size of a Vector can grow or shrink as needed to accommodate adding and removing
 * items after the Vector has been created.
 *
 * In Java, the Vector and List implementations both represent ordered collections, but there are differences between the two:
 *
 * Synchronization:
 *
 * Vector: It is synchronized by default, meaning it's thread-safe. Every method in a Vector is synchronized, which can sometimes lead to slower performance in a multi-threaded environment due to the overhead of synchronization.
 * List (e.g., ArrayList, LinkedList): These implementations (like ArrayList or LinkedList) are not synchronized by default. If thread safety is required, synchronization needs to be handled explicitly using Collections.synchronizedList() to wrap these non-thread-safe lists.
 * Performance:
 *
 * Vector: Due to its synchronized nature, performance might be slightly slower compared to non-synchronized counterparts, especially in scenarios where synchronization isn’t necessary.
 * List (e.g., ArrayList, LinkedList): These classes provide better performance in non-concurrent environments. ArrayList, for instance, is generally faster than Vector because it's not synchronized.
 * Growth rate:
 *
 * Vector: It doubles its array size by default when it needs to grow. This can be less memory-efficient when the collection grows.
 * List (e.g., ArrayList): It also grows its internal array, but by a larger factor (typically 1.5 times or a similar strategy). This can be more memory-efficient when compared to the doubling behavior of Vectors.
 * Legacy status:
 *
 * Vector: It's part of Java's older collections framework and is considered a legacy class.
 * List (e.g., ArrayList, LinkedList): These are part of the newer Collections Framework and offer more flexibility and are commonly used.
 * Iterator behavior:
 *
 * Vector: Its iterators are designed to be fail-safe, which means they won't throw ConcurrentModificationException if the vector is modified while iterating.
 * List (e.g., ArrayList, LinkedList): Iterators on ArrayList and LinkedList might throw ConcurrentModificationException if the list is structurally modified while being iterated without using the iterator's own methods for modification.
 * In general, unless there's a specific requirement for synchronization or compatibility with older code, using ArrayList or LinkedList (from the List interface) might be more preferable due to better performance and memory efficiency.
 */
public class VectorEstudio {


    public void estudioVector() {

        Vector vectorPersonas = new Vector();
        vectorPersonas.add(new Persona("Camila", 13, Genero.FEMENINO));
        vectorPersonas.add(new Persona("Fernando", 14, Genero.MASCULINO));
        vectorPersonas.add(new Persona("Natalia", 15, Genero.FEMENINO));
        vectorPersonas.add(new Persona("Giovanni", 12, Genero.MASCULINO));

        System.out.println("-----VECTOR INICIAL-----");
        vectorPersonas.forEach(System.out::println);

        System.out.println("-----ADICIONAR PERSONA EN INDICE 0-----");
        vectorPersonas.add(0, new Persona("Gerard", 55, Genero.NOINFORMA));
        vectorPersonas.forEach(System.out::println);

        System.out.println("-----ELEMENTO EN POSICION 3-----");
        System.out.println(vectorPersonas.elementAt(3));

        System.out.println("-----PRIMER ELEMENTO-----");
        System.out.println(vectorPersonas.firstElement());

        System.out.println("-----HASHCODE-----");
        System.out.println(vectorPersonas.hashCode());

        System.out.println("-----INDICE DE CAMILA-----");
        System.out.println(vectorPersonas.indexOf(new Persona("Camila", 13, Genero.FEMENINO)));

        System.out.println("-----REMOVER EN POSICION 0-----");
        System.out.println(vectorPersonas.remove(0));

        System.out.println("-----MODIFICAR EN POSICION 0-----");
        System.out.println(vectorPersonas.set(0, new Persona("Ferdinand", 33, Genero.MASCULINO)));

        System.out.println("-----VECTOR FINAL-----");
        vectorPersonas.forEach(System.out::println);
    }

    public static void main(String[] args) {
        VectorEstudio vectorEstudio = new VectorEstudio();
        vectorEstudio.estudioVector();
    }

}
