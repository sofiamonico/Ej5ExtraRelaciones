/*
*Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de
asientos (8 filas por 6 columnas). De Cine nos interesa conocer la película que se está
reproduciendo, la sala con los espectadores y el precio de la entrada. Luego, de las
películas nos interesa saber el título, duración, edad mínima y director. Por último, del
espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos
son etiquetados por una letra y un número la fila A1 empieza al final del mapa como se
muestra en la tabla. También deberemos saber si el asiento está ocupado por un
espectador o no, si esta ocupado se muestra una X, sino un espacio vacío.
 */
package entidades;

public class Persona {
    private String nombre;
    private int edad;
    private int dinero;
    private boolean entrada;

    public Persona(String nombre, int edad, int dinero, boolean entrada) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.entrada = entrada;
    }

    public boolean isEntrada() {
        return entrada;
    }

    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
}
