package com.tr.fs.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;

/**
 * Con la reflection de Java podemos inspeccionar campos, clases, interfaces, metodos y;
 * modificar sus valores y su comportamiento en tiempo de ejecución. La reflexión deber ser usada
 * con cuidado, pues puede llegar a modificarse el valor de los objetos, lo que puede dañar la integridad del
 * codigo.
 * Reflexión se usa en casos de pruebas unitarias, algunas librerias que usan IoC, para enlanzar los beans
 * en el spring container usan reflexion, para sacar informes, algunas librerias de serializacion y desserializacion
 * usan reflexion.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kitchen {

    private Integer cantidadElectrodomesticos;

    private Electrodomestico electrodomestico;

    private void informacionDeLaCocina() {
        System.out.println("Tu cocina tiene: " + cantidadElectrodomesticos
                + " electrodomesticos , y un(a) " + electrodomestico.getNombre()
                + ", de tipo " + electrodomestico.getTipo());
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Kitchen kitchen = new Kitchen(3, new Electrodomestico("Estufa", Tipo.GAS));
        System.out.println("Initial cantidadElectrodomesticos: " + kitchen.getCantidadElectrodomesticos());

        // Accessing the field cantidadElectrodomesticos using reflection
        Field field = Kitchen.class.getDeclaredField("cantidadElectrodomesticos");
        System.out.println(field);
        field.setAccessible(true); // Allowing access to private field
        field.set(kitchen, 5); // Setting the value of cantidadElectrodomesticos using reflection

        System.out.println("Updated cantidadElectrodomesticos: " + kitchen.getCantidadElectrodomesticos());
    }
}
