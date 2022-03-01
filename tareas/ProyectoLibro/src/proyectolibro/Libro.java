/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolibro;

/**
 *
 * @author Usuario
 */
public class Libro {
    private String nombre;
    private int paginas;
    private String autor;
    private int capitulos;
    private String editorial;

    public Libro() {
    }

    public Libro(String nombre, int paginas, String autor, int capitulos, String editorial) {
        this.nombre = nombre;
        this.paginas = paginas;
        this.autor = autor;
        this.capitulos = capitulos;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

public void abrir_libro(){
    System.out.println("El libro "+ this.nombre+ " esta abierto ");

  }
public void avanzar_capitulo(){
    System.out.println("El capitulo final ("+ this.capitulos+ ") esta por leerse");
  }
}