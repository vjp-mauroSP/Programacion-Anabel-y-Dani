/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro las variables que voy a utilizar y les doy un valor 
       int numero = 18;
       int suma = 0;
       //empieza while
       while (numero <= 139){
           suma = suma + numero;
           numero = numero + 2;
       }
       //aqui lo que saldra en pantalla 
        System.out.println("La suma de el total de los números pares es: " + suma);
        
       }
        
    }
    

