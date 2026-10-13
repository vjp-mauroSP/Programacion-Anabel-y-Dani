/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mi.appp;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class MiAppp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad1, edad2, edad3, media;
        Scanner teclado = new Scanner(System.in);
        
        // empiezo a pedir los datos de cada usuario
        System.out.println("introduce la primera edad");
        edad1 = teclado.nextInt();
        System.out.println("la edad de la primera persona es " + edad1);
        
        System.out.println("introduce la segunda edad");
        edad2 = teclado.nextInt();
        System.out.println("la edad de la segunda persona es " + edad1);
        
        System.out.println("introduce la tercera edad");
        edad3 = teclado.nextInt();
        System.out.println("la edad de la tercera persona es " + edad1);
        
        media = (edad1 + edad2 + edad3) / 3; 
        System.out.println("la edad media es " + (edad1 + edad2 + edad3 / 3));
        
        
        
       
                
    }
    
}
