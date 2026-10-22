/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo el Scanner y declaro las variables que vamos a utilizar
        Scanner teclado = new Scanner(System.in);
        int numeroSecreto;
        int numeroUsuario = 0;
        int intentos = 0;
        // introduzco el boolean que le va a decir al usuario si el numero es valido
        boolean numeroValido;
        //linea que genera el numero aleatorio 
        numeroSecreto = (int)(Math.random() * 100) + 1; 
        // repetimos el juego mientras no se acierte el número p la entrada no sea valida
        while (numeroUsuario != numeroSecreto){
            System.out.println("Adivina el número entre 1 y 100:");//SOUT que le pide al usuario que adivine el numero secreto
            try{ // la parte que intenta leer el número introducido por el usuario
                numeroUsuario = teclado.nextInt();
                numeroValido = true;  // si se introduce un número, indicamos que la entrada es válida
            }catch(InputMismatchException e) {
                System.out.println("Error: debes introducir un número.");// Mostramos un mensaje si el usuario introduce una letra u otro dato incorrecto
                teclado.nextLine(); // elimina el dato incorrecto para volvel a leer la entrada
                
                numeroValido = false;// esto indica que la entrada no es valida 
            }
            intentos++;// suma un intento cada vez que el usuario introduce un dato
            
            if (numeroValido){// solo comparamos los numero si la entrada es valida
               if (numeroUsuario < numeroSecreto){
                System.out.println("El número secreto es mayor");
                //si el número introducido es mayor que el secreto pues damos otra pista  
            }else if (numeroUsuario > numeroSecreto){
                System.out.println("El número secreto es menor");
            }
        }
        }
        System.out.println("¡Has acertado!");   // Mostramos un mensaje cuando el usuario consigue acertar
            System.out.println("Numero de intentos: " + intentos); // Mostramos el número total de intentos realizados
    }
    
}

    
    

