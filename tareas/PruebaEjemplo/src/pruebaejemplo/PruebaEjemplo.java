/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Usuario
 */
public class PruebaEjemplo {

    public static void main(String[] args) {
       Cuentahabiente[] lista = new Cuentahabiente[5];
       lista[0]= new Cuentahabiente(319013007, "Bryan Ramos", 63785.05f);
       lista[1]= new Cuentahabiente(319380928, "José Perez", 25789.25f);
       lista[2]= new Cuentahabiente(370368269, "Martin Fonseca", 10500.75f);
       lista[3]= new Cuentahabiente(412890379, "Julian Luna", 75950.55f);
       lista[4]= new Cuentahabiente(167297303, "Alexis González", 5100.35f);
       
       lista[0].retirarDinero(3200.00f);
       lista[1].retirarDinero(5500.00f);
       lista[2].retirarDinero(500.00f);
       lista[3].retirarDinero(9750.00f);
       lista[4].retirarDinero(2100.00f);

       System.out.println("Nivel de Cliente");
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.evaluarNivelCliente());
        }
    }
    
}
