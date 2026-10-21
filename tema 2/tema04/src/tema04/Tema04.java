/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04;
import java.util.Scanner;
import operaciones.operaciones;
/**
 *
 * @author alumno
 */
public class Tema04 {
    /**
     * metodo que imprime por pantalla hola mundo
     */
public static void saludar(){
    System.out.println("hola Mundo");
}

public static int pedirNumero(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("numero: ");
    return teclado.nextInt();
    
    
}
/**
 * metodo que multiplica dos numeros recibidos por parametro 
 * @param num1
 * @param num2
 * @return 
 */
public static int multiplicar(int num1, int num2){
    return num1 * num2;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        saludar();
        
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        int resultado = multiplicar(num1, num2);
        
        System.out.println("el resultado es: " + resultado);
        System.out.println(multiplicar(num1, num2));
        
        System.out.println( multiplicar(pedirNumero(), pedirNumero())) ;
        
        operaciones.sumar(num1, num2);
    }
    
}
