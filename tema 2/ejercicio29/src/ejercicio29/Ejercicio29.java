/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //lo que voy a utilizar
        Scanner teclado = new Scanner(System.in);
        int numeroSecreto;
        int numeroUsuario = 0;
        int intentos = 0;
        //linea que genera el numero aleatorio 
        numeroSecreto = (int)(Math.random() * 100) + 1; 
        
        while (numeroUsuario != numeroSecreto){
            System.out.println("Adivina el número entre 1 y 100:");
            numeroUsuario = teclado.nextInt();
            intentos++;
            if(numeroUsuario < numeroSecreto){
                System.out.println("El número secreto es mayor");
            }else if (numeroUsuario > numeroSecreto){
                System.out.println("El número secreto es menor");
            }
        }
        System.out.println("¡Has acertado!");
            System.out.println("Numero de intentos: " + intentos);
    }
    
}
