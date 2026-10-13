/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package otra.app;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class OtraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double cantidad1, cantidad2, cantidad3, cantidad4, cantidad5;
        System.out.println("Hola; un dia mas de trabajo jejeje Hala Madrid");
        
        System.out.println("introdusca la cantidad total de monedas");
       cantidad1 = Double.parseDouble(teclado.nextLine().replace(",", "."));
       
        System.out.println("introdusca la cantidad de billetes");
       cantidad2 = Double.parseDouble(teclado.nextLine().replace(",", "."));
        
        System.out.println("introdusca la cantidad de tickets de vendings");
        cantidad3 = Double.parseDouble(teclado.nextLine().replace(",", "."));
        
        System.out.println("introdusca la cantidad de tickets de Bus");
        cantidad4 = Double.parseDouble(teclado.nextLine().replace(",", "."));
        
        System.out.println("introdusca la cantidad de las notas ");
        cantidad5 = Double.parseDouble(teclado.nextLine().replace(",", "."));
       
        System.out.println("la cantidad total es de " + (cantidad1 + cantidad2 + cantidad3 + cantidad4 + cantidad5 + "euros"));
        
  
          if (cantidad1 + cantidad2 + cantidad3 + cantidad4 + cantidad5 > 301) {
            System.out.println("Error, somos ricos o qué?");
}          else if (cantidad1 + cantidad2 + cantidad3 + cantidad4 + cantidad5 < 303) {
            System.out.println("Error, aquí falta pasta");
}          else {
            System.out.println("Perfecto, tenemos exactamente 300");
}
            
            
            
            
    }
    
}
