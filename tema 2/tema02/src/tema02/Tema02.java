/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02;

/**
 *clase principañ de repaso del tema 2.
 * 
 * @author alumno
 */
public class Tema02 {
    //VARIABLES (globales)
    static int vida =100;
    
    // CONSTANTES
    final static float GRAVEDAD = 9.8f;
    
        public static void atacar(){
            int danio = 5; // variable local 
            System.out.println("La vida del heroe ahora es de " + ( vida - danio));
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        System.out.println("La vida del heroe es:" + vida);
        
        System.out.println("La gravedad es " + GRAVEDAD);
        
        // VARIABLES (Locales)
        // Enteros
        byte edad;
        short distancia = 100;
        int numMatricula = 2543;
        long numAlumnos = 30;
        
        // decimales
        float altura =1.70f;
        double peso = 10.5;
        
        //boolean
        boolean esReposo = true;
        
        //caracteres
        char letra = 'A';
        
        System.out.println("¿Es la variable distancia un numero par?");
        boolean esPar = distancia % 2 ==0;
        System.out.println("resto");
        System.out.println("esPar");
        
    }
    
}
