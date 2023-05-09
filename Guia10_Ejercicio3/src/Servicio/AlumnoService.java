/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main. */
package Servicio;


import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Alumno> alumnos = new ArrayList();
    ArrayList<Integer> notas = new ArrayList();
    
    
    public void crearAlumno() {
      
        String respuesta;
        do {
            notas = new ArrayList();
            Alumno a = new Alumno();
          
            System.out.println("Ingrese alumno");
            System.out.print("Nombre: ");
            a.setNombre(leer.next());
          
            for (int i = 0; i < 3; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                notas.add(leer.nextInt());
                a.setNotas(notas);
            }
            
            alumnos.add(a);
      
            System.out.println("Desea ingresar otro alumno? (S/N)");
            respuesta = leer.next();
            System.out.println("------------------------------------------------");
            
        } while (!respuesta.equalsIgnoreCase("N"));
        
    
    }
   
    public void mostrarListaAlumnos(){
        Iterator <Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    public void buscarAlumno() {
        double notaFinal;
        int contador=0;
        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombre = leer.next();

        for (Alumno aux : alumnos) {
            if (aux.getNombre().contains(nombre)) {
                notaFinal = notaFinal(nombre);
                System.out.println("La nota final es: " + notaFinal);   
                contador ++;
            }
        }
        
        if (contador==0) {
            System.out.println("El alumno no se encuentra en la lista.");
        }

    }
    
    public double notaFinal(String nombre) {
        double notaF = 0;
        for (Alumno aux : alumnos) {
            if (aux.getNombre().contains(nombre)) {
                for (int i = 0; i < 3; i++) {
                    notaF += aux.getNotas().get(i);
                }

            }
        }
        return (notaF / 3);
    }
}

