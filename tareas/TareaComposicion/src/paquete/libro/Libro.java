/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.libro;

import componentes.libro.Autor;
import componentes.libro.Editorial;

/**
 *
 * @author Usuario
 */
public class Libro {
    private String titulo;
    private int paginas;
    private Autor escritor;
    private Editorial editorial;

    public Libro() {
    escritor = new Autor();
    editorial = new Editorial();
    }

    public Libro(String titulo, int paginas, Autor escritor, Editorial editorial) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.escritor = escritor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }
@Override
    public String toString() {
    return "Libro{" + "titulo=" + titulo + ", paginas=" + paginas + ", escritor=" + escritor + ", editorial=" + editorial +'}';
    }

}
