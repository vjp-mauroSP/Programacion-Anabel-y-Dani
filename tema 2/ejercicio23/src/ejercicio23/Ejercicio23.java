/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
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
        
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce un número mayor que 1:");
        numero = teclado.nextInt();
        
        while(numero<=1){
            System.out.println("Introduce un número mayor que 1");
            numero = teclado.nextInt();
        }
        int contador = 1;
        while (contador <= numero){
            System.out.println(contador);
            contador ++;
        }
        }
    }
    

