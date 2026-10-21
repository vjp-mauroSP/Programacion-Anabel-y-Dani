/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04ejercicio3;
    import java.util.Scanner;
    
/**
 *
 * @author alumno
 */
public class Tema04ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1, num2, num3;
        
        System.out.println("por favor introduce un numero: ");
        num1 = teclado.nextInt();
        System.out.println("por favor introduce el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.println("por favor introduce el tercer numero: ");
        num3 = teclado.nextInt();
        
        numeroMayor.mostrarMayor(num1, num2, num3);
        

    }
    
}
