/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema04ejercicio3;

/**
 *
 * @author alumno
 */
public class numeroMayor {
    public static void mostrarMayor(int num1, int num2, int num3) {
    if (num1 >= num2 && num1 >= num3) {
        System.out.println("El número mayor de los introducidos es el " + num1);
      } else if (num2 >= num1 && num2 >= num3) {
        System.out.println("El número mayor de los introducidos es el " + num2);
      } else {
        System.out.println("El número mayor de los introducidos es el " + num3);
    }
}
}
