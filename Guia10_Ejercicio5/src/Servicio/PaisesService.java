/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.*/
package Servicio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class PaisesService {
    HashSet <String> conjuntoPaises = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    public void ingresarPais() {
        int opcion;
        do {
            System.out.print("Ingrese un pais: ");
            String nombre = leer.next();
            System.out.println("----------------------------------------");
            System.out.println("1. Para ingresar otro pais.");
            System.out.println("2. Para salir.");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();
            System.out.println("----------------------------------------");
            conjuntoPaises.add(nombre);
        } while (opcion != 2);
    }
    
    public void mostrarConjunto(){
        conjuntoPaises.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    public void ordenarAbc() {
        ArrayList<String> listaPaises = new ArrayList(conjuntoPaises);
        Collections.sort(listaPaises);
        listaPaises.forEach((aux) -> {
            System.out.println(aux);
        });

    }

    public void eliminarPais(){
        Iterator <String> it = conjuntoPaises.iterator();
        String eliminarPais;
        int contador=0;
        System.out.print("Ingrese un pais para eliminarlo del conjunto: ");
        eliminarPais = leer.next();
        
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(eliminarPais)) {
                it.remove();
                contador++;
            }
        }
        if (contador==0) {
            System.out.println("El pais no se encuentra en el conjunto.");
        }else{
            System.out.println("----------------------------------------");
            System.out.println("LISTA FINAL DE PAISES: ");
            mostrarConjunto();
        }
    }
}

