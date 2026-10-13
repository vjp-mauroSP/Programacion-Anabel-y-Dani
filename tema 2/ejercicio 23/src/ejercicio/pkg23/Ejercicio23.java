/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg23;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //esta es la parte donde declaro las unidades 
                int unidades;
                double precio;
               //mi codigazo
                Scanner teclado = new Scanner(System.in);
                System.out.println("Hola introdusca el precio del modelo de las unidades que quiere comprar ");
                precio = teclado.nextDouble();
                System.out.println("¿Cuantas unidades quiere comprar?");
                unidades = teclado.nextInt();
                System.out.println("El precio total de su compra es de " + precio * unidades + "Euros" );
                
                
                
    }
    
}
