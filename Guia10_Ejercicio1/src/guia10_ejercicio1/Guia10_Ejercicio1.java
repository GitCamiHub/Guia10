/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
package guia10_ejercicio1;

import Servicio.PerroService;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia10_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PerroService ps = new PerroService();
        
        ps.ingresarRazas();
        System.out.println("-------------------------------------------");
        System.out.println("RAZAS INGRESADAS:");
        ps.mostrarLista();
        System.out.println("-------------------------------------------");
        System.out.println("ELIMINAR RAZA:");
        ps.eliminarRaza();
        System.out.println("-------------------------------------------");
        System.out.println("MOSTRAR LISTA ORDENADA:");
        ps.ordenarLista();
    }
    
}
