/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04ejercicio2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema04ejercicio2 {


    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        int resultado;
        
        System.out.println("por favor introduce un numero");
        num1 = teclado.nextInt();
        
        System.out.println("por favor introduce otro numero");
        num2 = teclado.nextInt();
        
        if (num1 > 10){
            resultado = operaciones.multiplicar(num1, num2);
            System.out.println("el resultado de multiplicar es: " + resultado);
        }else{
            operaciones.sumar(num1, num2);
            
        }
            
            
    }
    
   }
