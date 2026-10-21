/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04ejercicio1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema04ejercicio1 {
public static void comprobarNumero(int numero){
    if (numero > 0){
        System.out.println("el numero introducido es positivo");
    }else if(numero < 0){
        System.out.println("el numero introducido es negativo");
    }else{
        System.out.println("el numero introducido es cero");
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado =  new Scanner (System.in);
        
        
        System.out.println("porfa introduce un numero");
        int numero = teclado.nextInt();
        
        
        comprobarNumero(numero);
    
    }
        
}
