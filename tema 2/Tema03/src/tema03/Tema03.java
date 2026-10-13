/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice = 0;
        
        //while
     
        System.out.println("while");
        while ( indice < 10) {
                    System.out.println (indice);
                     indice++;
            
        }
        // do while
        indice = 0;
        System.out.println("do while");
        do {
            System.out.println(indice);
            indice++;
        }while(indice < 10);
        //for
        for(int i = 0; i < 10; i++)
        System.out.println("i");
        
        //menús
        int opc = 0;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("ver catalogo"); 
            System.out.println("ver catalogo");
            System.out.println("solicitar libro");
            System.out.println("devolver libro");
            
            System.out.println("elija una opcion");
            opc = teclado.nextInt();
            
            switch(opc){
                case 1: System.out.println("menu");
                case 2: System.out.println(" cosas para comer");
                case 3: System.out.println("mediciones comestibles");
                       
               
            }
        }while(opc != 4);
    }
    
}
