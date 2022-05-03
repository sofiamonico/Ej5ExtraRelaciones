/*
 Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y
se los ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde
ya este ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que
sólo se podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada,
si hay espacio libre en la sala y si tiene la edad requerida para ver la película. En caso de
que el asiento este ocupado se le debe buscar uno libre.

10
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y
numero de cada asiento o solo las X y espacios vacíos.
 */
package ej5relacionesext;

import entidades.Cine;
import entidades.servicios.Servicios;

public class Ej5RelacionesExt {

    public static void main(String[] args) {
     
        Cine c = Servicios.crearCine();
        Servicios.mostrarSala(c);
        Servicios.comprarEntradas(c);
        Servicios.acomodarPersonas(c);
        Servicios.mostrarSala(c);
    }
    
}
