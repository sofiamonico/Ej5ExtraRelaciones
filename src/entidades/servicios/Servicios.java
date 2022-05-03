
package entidades.servicios;

import entidades.Cine;
import entidades.Pelicula;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class Servicios {
    
    public static Cine crearCine(){
        return new Cine(
                crearPelicula(),
                crearSala(),
                150,
                crearPersonas()
        );
    }
    
    public static void mostrarSala(Cine c){
        c.mostrarSala();
    }
    
    
    public static String[][] crearSala(){
        String sala[][]=new String[8][6];
        String letra=null;
        int numero=8;
        for (int i = 0; i < 8; i++)
        {
            String num2=String.valueOf(numero);
            for (int j = 0; j < 6; j++)
            {
                 switch(j){
                case 0:
                    letra="A";
                    break;
                case 1:
                    letra="B";
                    break;
                case 2:
                    letra="C";
                    break;
                case 3:
                    letra="D";
                    break;
                case 4:
                    letra="E";
                    break;
                case 5:
                    letra="F";
                    break;
            }
               sala[i][j]=letra+num2+" "+"|";
               
        }
            numero--;
 
    }
    
        return sala;
      
  }
    
    public static Pelicula crearPelicula(){
        return new Pelicula("Titanic",18,2,"El Chabon");
       
    }
    
   
    
    public static ArrayList arrayNombres(){
        ArrayList<String> listaNombres= new ArrayList(
        Arrays.asList(
        "Sofia",
        "Leandro",
        "Pepe",
        "Juan",
        "Troy",
        "Pearson",
        "Michlee",
        "Sofia",
        "Leandro",
        "Pepe",
        "Juan",
        "Troy",
        "Pearson",
        "Michlee"
        ));
        Collections.shuffle(listaNombres);
        
        return listaNombres;
        
    }
    
    public static ArrayList arrayEdad(){
        ArrayList<Integer> listaEdad= new ArrayList(
        Arrays.asList(
        22,
        62,
        35,
        44,
        31,
        26,
        24,
        22,
        62,
        35,
        44,
        31,
        26,
        24
        ));
        Collections.shuffle(listaEdad);
        return listaEdad;
        
    }
    
    public static ArrayList arrayDinero(){
        ArrayList<Integer> listaDinero= new ArrayList(Arrays.asList(
                450,
                50,
                150,
                340,
                210,
                560,
                660,
                450,
                50,
                150,
                340,
                210,
                560,
                660
                ));
        Collections.shuffle(listaDinero);
        return listaDinero;
    }
    
    
    
    public static ArrayList crearPersonas(){
        ArrayList<Integer> listaDinero = arrayDinero();
        ArrayList<Integer> listaEdad= arrayEdad();
        ArrayList<String> listaNombres= arrayNombres();
        ArrayList<Persona> personas = new ArrayList();
        
        for (int i = 0; i < listaNombres.size(); i++)
        {
            personas.add(new Persona(listaNombres.get(i),listaEdad.get(i),listaDinero.get(i),false));
        }
        return personas;
    }
    
    public static void comprarEntradas(Cine c){
        Iterator<Persona> it = c.getPersonas().iterator();
        while(it.hasNext()){
            Persona p = it.next();
            if (p.getDinero()>=c.getPrecio() && p.getEdad()>=c.getPelicula().getEdadMinima())
            {
                p.setEntrada(true);
            }
        }
    }
    
    public static void acomodarPersonas(Cine c){
        Iterator<Persona> it = c.getPersonas().iterator();
        while (it.hasNext())
        {
            Persona p = it.next();
            if (p.isEntrada()==true)
            {
               while(estaOcupado(c)){
                   System.out.println("ASIENTO OCUPADO");
               }
                System.out.println("El cliente "+ p.getNombre()+" está sentado");
            }
            
        }
    }
    
    public static boolean estaOcupado(Cine c){
        String[][] sala = c.getSala();
        boolean ocupado=true;
        int randomI=(int) (Math.random() * 8);
        int randomJ=(int) (Math.random() * 6);
                if(" ".equals(sala[randomI][randomJ].substring(2,3))){
                    ocupado=false;
                    sala[randomI][randomJ]=sala[randomI][randomJ].replace(" ", "X");
                }
       c.setSala(sala);
       return ocupado;
    }
    
}
