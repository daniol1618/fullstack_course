package com.tr.fs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FsApplication.class, args);

        //ListaEstudio listaEstudio = new ListaEstudio();
        //listaEstudio.obtenerPersonasOrdenadasPorNombre().forEach(System.out::println);
        //listaEstudio.obtenerPersonasOrdenadasPorEdadReversed().forEach(System.out::println);
        //System.out.println(listaEstudio.obtenerPrimeraPersona());
        //System.out.println(listaEstudio.contarNumeroPersonas());
        //System.out.println(listaEstudio.addicionarNuevaPersona());
    }
}