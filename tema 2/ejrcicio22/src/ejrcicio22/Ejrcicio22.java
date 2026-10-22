/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejrcicio22;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejrcicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //aqui inicializo el scanner y declaro las variables que voy a utilizar.
        Scanner teclado = new Scanner(System.in);
         int numero1, numero2, numero3;
         
         //aqui pongo lo que quiero que el usuario escriba mas lo que podria dar error
           
      try{
        
         System.out.println("intruduce el primer numero");
            numero1 = teclado.nextInt();
            System.out.println("intruduce el segundo numero");
            numero2 = teclado.nextInt();
         //escribo la operacion de suma 
            numero3 = numero1 + numero2;
            System.out.println("el resultado de la suma es:" + numero3);
      }catch(InputMismatchException e) {
          System.out.println("Error bro debes introducir un número.");
      }
      
    }
    
}
