/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes.pelicula;

/**
 *
 * @author Usuario
 */
public class Director {
    private String nombre;
    private String mayorExito;

    public Director() {
    }

    public Director(String nombre, String mayorExito) {
        this.nombre = nombre;
        this.mayorExito = mayorExito;
    }

    public String getMayorExito() {
        return mayorExito;
    }

    public void setMayorExito(String mayorExito) {
        this.mayorExito = mayorExito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@Override
    public String toString() {
    return "Director{" + "nombre=" + nombre + ", mayorExito=" + mayorExito + '}';
    }
public void preparar(){
    System.out.println("El director" + this.nombre + " esta preparando el ensayo ");}
}
