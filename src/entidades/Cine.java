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

import java.util.ArrayList;

public class Cine {
    private Pelicula pelicula;
    private String[][] sala;
    private int precio;
    private ArrayList <Persona> personas;

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public Cine() {
    }

    public Cine(Pelicula pelicula, String[][] sala, int precio, ArrayList<Persona> personas) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
        this.personas = personas;
    }

    

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
     public void mostrarSala(){
          for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                System.out.print(this.sala[i][j]);
            }
            System.out.println("");
        }
    }
}
