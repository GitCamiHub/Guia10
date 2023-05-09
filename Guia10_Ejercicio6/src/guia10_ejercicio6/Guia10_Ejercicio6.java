/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/

package guia10_ejercicio6;

import Servicio.ProductoServicio;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia10_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoServicio ps;
        menu(ps = new ProductoServicio());
    }
    
    public static void menu(ProductoServicio ps){
         Scanner leer = new Scanner(System.in);
        
        int opcion;
      
        System.out.println("=========================================");
        System.out.println("1. Introducir producto.");
        System.out.println("2. Mostrar lista de productos.");
        System.out.println("3. Modificar el precio de un producto.");
        System.out.println("4. Eliminar producto.");
        System.out.println("5. Salir.");
        System.out.print("ELIJA UNA OPCIÓN: ");
        opcion = leer.nextInt();
          switch (opcion) {
            case 1:
                ps.introducirProducto();
                menu(ps);
                break;
            case 2:
                ps.mostrarProductos();
                menu(ps);
                break;
            case 3:
                ps.modificarPrecio();
                menu(ps);
                break;
            case 4:
                ps.eliminarProducto();
                menu(ps);
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Ingrese una opcion correcta.");
                menu(ps);
        }

        
    }
    
}
