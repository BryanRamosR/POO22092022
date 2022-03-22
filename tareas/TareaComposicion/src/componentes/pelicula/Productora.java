/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes.pelicula;

/**
 *
 * @author Usuario
 */
public class Productora {
    private String nombre;
    private int añoCreacion;

    public Productora() {
    }

    public Productora(String nombre, int añoCreacion) {
        this.nombre = nombre;
        this.añoCreacion = añoCreacion;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@Override
    public String toString() {
    return "Productora{" + "nombre=" + nombre + ", añoCreacion=" + añoCreacion + '}';
    }
public void producir(){
    System.out.println("La productora" + this.nombre + " esta filmando una pelicula ");}
}
