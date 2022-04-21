/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int edad = 20;
        System.out.println("Edad = " + edad);
    Integer edad2 = new Integer (22);
        System.out.println( edad2 );
    double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println( edad2.shortValue());
        System.out.println(".-.-.-.-.-.-.-.-.-.");
    // convertir Strings a entero
    String cadena = "99";
    int altura = Integer.parseInt(cadena); // Método miembro o método de clase 
    altura += 1;
        System.out.println("Altura = " + altura);

    float y= Float.parseFloat(cadena);
    y=y +0.5f;
        System.out.println("Altura = " + y);
        System.out.println("---------------------");

    
    
        System.out.println("Troncos de un arbol= " + Arbol.tronco );
        Arbol.generarOxigeno();
        /*
        JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null,"Dame tu edad","Introducir datos",JOptionPane.INFORMATION_MESSAGE);
        System.out.println(dato);
        */

    //Codigo sin operador ternario
    int edad3 = 20;
    // validar si es mayor de edad
    String resultado = "";
    if(edad3 < 18){
       resultado = "Menor de edad";
} else {
       resultado = "Mayor de edad, ten un tequila para la garganta";
}
        System.out.println( resultado );

//acá, hareel mismo algoritmo pero con operador ternario
// <cond>? <True> : <False>;

int edad4 = 15;
String res = "";
res = edad4 < 18? "Menor de edad 4" : "Mayor de edad, tequila";
        System.out.println(res);

//Si tenemos logica asi podemos utilizar ternario
// es muy elegante y ahora lneas de codigo

//Por ultimo la version minima 
int edad5 = 19;
System.out.println(edad5 < 18? "Menor de edad 5":"Ya! el tequila");
 
//Siguiente 

int val1 = 1;
int val2 = 2;
// haremos una comparacion or a nivel de bits es decir 
/*
val1 = 0000...0001
val2 = 0000...0010

1 or 1 = 1
1 or 0 = 1
0 or 0 = 0
Por otro lado 
1 and 0 = 0
1 and 1 = 1
0 and 1 = 0
*/
        System.out.println( val1 | /*&*/ val2 );
/*
Que esta pasando, esto: 
   val1 = 0000...0001;
 or
   val2 = 0000...0010;
----------------------
          0000...0011 => 3 
*/

// Desplazamiento
int val3 = 1 ; //0000...0001
// int val4 = << val3;
int val4 = 0;
val4 = val3 << 2; // El segundo valor es el numero de desplazamientos a la izquierda 
        System.out.println( val4 ); //Tiene que dar 4

//ARREGLOS

        System.out.println("----ARREGLOS----");
    int[]edades; // Primero se declara que sera un arreglo, en este punto aun no se reserva memoria.
    // el segundo paso es reservarlo, de un tamaño especifico
    edades = new int [5];
        System.out.println(edades);
    edades[0]=10;
        System.out.println("La primer edad es :" + edades[0]);

    // Declarar e inicializar en una sola linea 

    int [] estaturas = new int[5];

// ahora... al igual que en C y C++, puedes asignar valores

int [] pesos = {86,99,56,76,77}; //en Kilos 
// Este ultimo veremos su contenido
System.out.println( pesos[0] ); //86  
System.out.println( pesos[1] ); //99  
System.out.println( pesos[2] ); //56  
System.out.println( pesos[3] ); //76  
System.out.println( pesos[4] ); //77
// Imprime lo mismo pero con menos lneas de cofigo 
System.out.println("------ CON FOR ------");
for (int i = 0; i < pesos.length; i++){
    System.out.println( pesos[i] );
}  

//Ejercicio: Imprimirlos a la inversa 

        System.out.println("Inverso");
for (int i = pesos.length-1; i>=0; i--){
    System.out.println( pesos[i]);
}

/*
En desarrollos de la vida real, programar con arreglos es muy común, 
porque por ejemplo van a recuperar datos desde una base de datos... por ejemplo
una tabla de alumnos en la BD... de lado de Java debes tener una forma de almacenarlos.
y ahi es donde entran los arreglos 
*/

System.out.println("Arreglo de alumnos");
        Alumno[] lista = new Alumno[5];
        lista[0]= new Alumno("99999", 2, 9.0f);
        lista[1]= new Alumno("99999", 2, 7.0f);
        lista[2]= new Alumno("99999", 2, 7.0f);
        lista[3]= new Alumno("99999", 2, 8.0f);
        lista[4]= new Alumno("99999", 2, 6.0f);
        for (int i = 0; i < lista.length; i++) {
           Alumno alumno =lista[i];
            System.out.println(alumno.evaluarDesempenio());
          }
        
        System.out.println("Con for each");
        for (Alumno alumno: lista) {
            System.out.println(alumno.evaluarDesempenio());
        }
    }
        
    
    }       