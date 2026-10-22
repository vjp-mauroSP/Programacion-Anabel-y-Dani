/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaro teclado para el Scanner
        Scanner teclado = new Scanner(System.in);
        // las variables que voy a utilizar
        String contraseña;
        String contraseñaCorrecta = "1234";
        int intentos = 0;
        //aqui pongo el bucle do while
        
        do{
            System.out.println("por favor introduce la contraseña");
            contraseña = teclado.nextLine();
            intentos++;
            
            if (contraseña.equals(contraseñaCorrecta)){
                System.out.println("¡¡¡Epaaa!!! Has introducido la contraseña correcta");
            }
        } while (!contraseña.equals(contraseñaCorrecta) && intentos < 3);
        
        
            if (!contraseña.equals(contraseñaCorrecta) && intentos == 3) {
    System.out.println("Error de acceso");
}
                
            }
}


    
    
    

