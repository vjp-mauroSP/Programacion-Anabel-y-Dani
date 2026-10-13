/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24yuju;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio24yuju {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //los tipos de datos que voy a utilizar
        Scanner teclado = new Scanner(System.in);
             double nota1, nota2, nota3, nota4, nota5, nota6;
             
             System.out.println("por favor introduzca la nota de programacion");
             nota1 = teclado.nextDouble();
             System.out.println("introduzca la nota de lenguajes de marca");
             nota2 = teclado.nextDouble();
             System.out.println("introduzca las notas de bases de datos");
             nota3 = teclado.nextDouble();
             System.out.println("introduzca las notas de entornos de desarrollo");
             nota4 = teclado.nextDouble();
             System.out.println("introdusca las notas de sistemas informaticos");
             nota5 = teclado.nextDouble(); 
             System.out.println("introduzca las notas de LMSGI");
             nota6 = teclado.nextDouble();
             
             System.out.println("su nota media es de " + (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6);
    }
    
}
