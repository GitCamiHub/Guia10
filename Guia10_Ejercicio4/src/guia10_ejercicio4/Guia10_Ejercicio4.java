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
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package guia10_ejercicio4;


import Servicio.PeliculaService;

/**
 *
 * @author BANGHO
 */
public class Guia10_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();
        System.out.println("AGREGAR PELICULAS:");
        ps.crearPelicula();
        System.out.println("-------------------------------------------");
        System.out.println("PELICULAS AGREGADAS:");
        ps.mostrarPeliculas();
        System.out.println("-------------------------------------------");
        System.out.println("PELICULAS QUE DURAN MAS DE UNA HORA:");
        ps.pelisLargas();
        System.out.println("-------------------------------------------");
        System.out.println("ORDENADAS DE MAYOR A MENOR DURACIÓN: ");
        ps.ordenarMayorAMenor();
        System.out.println("-------------------------------------------");
        System.out.println("ORDENADAS DE MENOR A MAYOR DURACIÓN: ");
        ps.ordenarMenorAMayor();
        System.out.println("-------------------------------------------");
        System.out.println("ORDENADAS ALFABETICAMENTE POR TITULO: ");
        ps.ordenarAlfabeticamenteTitulo();
        System.out.println("-------------------------------------------");
        System.out.println("ORDENADAS ALFABETICAMENTE POR DIRECTOR: ");
        ps.ordenarAlfabeticamenteDirector();
        System.out.println("-------------------------------------------");
    }
    
}
