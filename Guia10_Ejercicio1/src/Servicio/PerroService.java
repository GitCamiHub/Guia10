/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada. */
package Servicio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class PerroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <String> razasPerros = new ArrayList();
  
    
    public void ingresarRazas(){
        String respuesta;
        do{
        System.out.print("Raza del perro: ");
        String raza = leer.next();
        razasPerros.add(raza);
        do{
        System.out.print("Desea ingresar otro perro?(si/no): ");
        respuesta = leer.next();
        }while (!respuesta.equalsIgnoreCase("si")&&(!respuesta.equalsIgnoreCase("no")));
        }while (!respuesta.equalsIgnoreCase("no"));
       
    }
 
    public void mostrarLista() {
        for (String var : razasPerros) {
            System.out.println(var);
        }
    }
    
    public void eliminarRaza() {
        Iterator <String> it = razasPerros.iterator();
        System.out.print("Qué perro quiere eliminar? Ingrese la raza: ");
        String eliminarPerro = leer.next();
        int contador=0;
        for (String var : razasPerros) {
            if (var.equals(eliminarPerro)) {
                contador++;
            }
        }
        
        if (contador==0) {
            System.out.println("La raza " + eliminarPerro + " no se encuentra en la lista.");
        }else{
     
        while(it.hasNext()){
            String aux = it.next();
            if (aux.equals(eliminarPerro)) {
                it.remove();
            }
        }
            
    }
    }
    public void ordenarLista(){
        Collections.sort(razasPerros);
        for (String aux : razasPerros) {
            System.out.println(aux);
        }
    }
}    
    

    
    

