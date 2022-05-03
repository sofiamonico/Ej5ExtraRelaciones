/*
 * *Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de
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

public class Pelicula {
    
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
}
