
package ESTRUCTURAS_SELECTIVAS;

import java.util.Scanner;

/**IfSimple.java – Control de acceso por edad

* Problema: Solicite al usuario su edad (entero).
Si la edad es mayor o igual a 18, muestre: Acceso permitido.
Si no, no muestre nada adicional.

Requisitos:

Validar que la edad sea >= 0. Si no lo es, mostrar Edad inválida.
Usar if simple (sin else para el caso “menor a 18”).
Ejemplo (entrada → salida):

18 → Acceso permitido
-2 → Edad inválida 
 * 
 * @author EMILY RIVERA
 * @version 1.0 */


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