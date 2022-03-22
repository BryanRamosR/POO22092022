/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import componentes.libro.Autor;
import componentes.libro.Editorial;
import componentes.pelicula.Actor;
import componentes.pelicula.Director;
import componentes.pelicula.Productora;
import paquete.libro.Libro;
import paquete.pelicula.Pelicula;


/**
 *
 * @author Usuario
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Pelicula peli1 = new Pelicula("La forma del agua", "Romance/Fantasia", 
new Actor("Doug Jones", "Estadounidense"),
new Director("Guillermo del Toro", "La forma del agua"),
new Productora("Searchlight Pictures", 1994));
        System.out.println( peli1 );

Libro lib1 = new Libro("Las batallas en el desierto", 72, 
new Autor("José Emilio Pacheco", 74),
new Editorial("Tusquets", "Barcelona"));
        System.out.println( lib1 );
}
}