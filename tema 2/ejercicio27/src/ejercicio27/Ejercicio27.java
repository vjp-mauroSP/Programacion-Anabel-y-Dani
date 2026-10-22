/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // las cosas que voy a usar
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2;
        int opcion;
        
        System.out.println("dame el primer numero bro");
        numero1 = teclado.nextDouble();
        
        System.out.println("date vida bro dame el segundo numero");
        numero2 = teclado.nextDouble();
        
        opcion = 0;
        while(opcion != 5){
            System.out.println("MENU");
            System.out.println("1- sumar");
            System.out.println("2- restar");
            System.out.println("3- multiplicar");
            System.out.println("4-dividir");
            System.out.println("5- salir de el programa");
            System.out.println("elige una opcion");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:
                 System.out.println("resultado: " + (numero1 + numero2));
                    break;
                    
                case 2:
                    System.out.println("resultado: " + (numero1 - numero2));
                    break;
                
                case 3:
                    System.out.println("resultado " + (numero1 * numero2));
                    break;
                    
                case 4:
                    try{
                        if (numero2 == 0){
                            throw new ArithmeticException();
                        }
                        System.out.println("resultado: " + (numero1 / numero2));
                        }catch (ArithmeticException e){
                            System.out.println("error: no se puede dividir entre cero. ");
                    }
                    break;
                    
                case 5:
                     System.out.println("Saliendo del programa...");
                     break;

                default:
                System.out.println("Opción incorrecta.");
                 break;
            }
        }
        
    }
    
}
