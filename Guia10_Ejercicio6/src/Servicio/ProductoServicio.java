/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/

package Servicio;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class ProductoServicio {
    HashMap <String,Double> productos = new HashMap();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void introducirProducto(){
        String respuesta;
        do{
            System.out.print("Ingrese un producto: ");
            String producto = leer.next();
            System.out.print("Precio: ");
            double precio = leer.nextDouble();
            productos.put(producto,precio);
            System.out.println("---------------------------------------------");
            System.out.println("Desea ingresar otro producto? (SI/NO)");
            respuesta = leer.next().toUpperCase();
        }while (!respuesta.equalsIgnoreCase("NO"));
    }
    
    public void modificarPrecio(){
        System.out.println("---------------------------------------------");
        System.out.print("Ingrese el nombre del producto para modificar su precio: ");
        String producto = leer.next();
        
            if (productos.containsKey(producto)) {
                System.out.println("Precio actual: $" + productos.get(producto));
                System.out.print("Ingrese el nuevo precio: $");
                double nuevoPrecio = leer.nextDouble();
                productos.replace(producto, nuevoPrecio);
            }else{
                System.out.println("El producto no se encuentra en la lista.");
            }
        
    }
    
    public void eliminarProducto(){
        System.out.println("---------------------------------------------");
        System.out.println("ELIMINAR UN PRODUCTO: ");
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        String nombre = leer.next();
        
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Se elimino el producto " + nombre);
        }else{
            System.out.println("El producto no se encuentra en la lista.");
        }
        
    }
    
    public void mostrarProductos(){
        System.out.println("---------------------------------------------");
        System.out.println("LISTA DE PRODUCTOS: ");
        productos.entrySet().forEach((entry) -> {
            String producto = entry.getKey();
            Double precio = entry.getValue();
            System.out.println("* Producto: " + producto + " | Precio: $" + precio);
        });
        
    }
}
    

