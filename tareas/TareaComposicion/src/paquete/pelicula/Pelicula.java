/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.pelicula;

import componentes.pelicula.Actor;
import componentes.pelicula.Director;
import componentes.pelicula.Productora;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    private String nombre;
    private String género;
    private Actor actor;
    private Director director;
    private Productora productora;

    public Pelicula() {
    actor = new Actor();
    director = new Director();
    productora = new Productora();
    }

    public Pelicula(String nombre, String género, Actor actor, Director director, Productora productora) {
        this.nombre = nombre;
        this.género = género;
        this.actor = actor;
        this.director = director;
        this.productora = productora;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
@Override
    public String toString() {
    return "Pelicula{" + "nombre=" + nombre + ", género=" + género + ", actor=" + actor + ", director=" + director + ", productora=" + productora + '}';
    }
}
