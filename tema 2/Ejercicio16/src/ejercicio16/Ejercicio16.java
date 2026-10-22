/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 21;
        int contador = 0;
        
        //comienzo el bucle while
     while(num <= 160){
         System.out.println(num);
         num= num +2;
         contador++;
     }   
        System.out.println("la cantidad de numero impares es " + contador);
    }
    
}
