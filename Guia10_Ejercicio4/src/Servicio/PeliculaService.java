/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/

package Servicio;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Pelicula> listaPeliculas = new ArrayList();
    
    public void crearPelicula(){
        String respuesta;
        
        do{
        Pelicula p = new Pelicula();
        System.out.print("Titulo: ");
        p.setTitulo(leer.next());
        System.out.print("Director: ");
        p.setDirector(leer.next());
        System.out.print("Duración en horas: ");
        p.setDuracion(leer.nextDouble());
        
        listaPeliculas.add(p);
        
        System.out.println("Desea agregar otra pelicula? SI/NO");
        respuesta = leer.next();
        
        }while (!respuesta.equalsIgnoreCase("NO"));
}
    
    public void mostrarPeliculas(){
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
    
    public void pelisLargas(){
        for (Pelicula aux : listaPeliculas) {
            if (aux.getDuracion()>1) {
                System.out.println(aux);
            }
        }
    }
    
    public void ordenarMayorAMenor(){
        Collections.sort(listaPeliculas, Pelicula.ordenarMayorAMenor);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
    
    public void ordenarMenorAMayor(){
        Collections.sort(listaPeliculas, Pelicula.ordenarMenorAMayor);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
    
    public void ordenarAlfabeticamenteTitulo(){
        Collections.sort(listaPeliculas, Pelicula.ordenaraAlfabeticamenteTitulos);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
    
    public void ordenarAlfabeticamenteDirector(){
        Collections.sort(listaPeliculas, Pelicula.ordenaraAlfabeticamenteDirectores);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
    
}
