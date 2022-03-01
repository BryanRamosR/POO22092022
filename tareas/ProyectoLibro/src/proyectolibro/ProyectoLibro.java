/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolibro;

/**
 *
 * @author Usuario
 */
public class ProyectoLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro atri=new Libro();
        atri.setNombre("Las batallas en el desierto");
        System.out.println("Nombre: "+ atri.getNombre());
        atri.setAutor("Jose Emilio Pacheco");
        System.out.println("Autor: "+ atri.getAutor());
        atri.setEditorial("Era");
        System.out.println("Editorial: "+ atri.getEditorial());
        atri.setPaginas(68);
        System.out.println("Paginas: "+ atri.getPaginas());
        atri.setCapitulos(12);   
        System.out.println("Capitulos: "+atri.getCapitulos());    
        
        atri.abrir_libro();
        atri.avanzar_capitulo();
    }
    

}
