
package ESTRUCTURAS_SELECTIVAS;

import java.util.Scanner;

/**
 *
 * @author Emily R
 */
public class IF_SIMPLE {

    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
         System.out.print("Ingrese su edad");
         edad = tcl.nextInt();
        
        if (edad <= 0) {
            System.out.println("Edad Inválida");
        }
        if (edad >= 18){
            System.out.println("ACCESO PERMITIDO");    
        }
    }
}
/**
 * RUN: 
 * run:
Ingrese su edad 18
ACCESO PERMITIDO
 */