
package ESTRUCTURAS_REPETITIVAS.newpackage;

/**
 * DoWhileBasico.java – Menú que se repite
Problema: Mostrar un menú:

Saludar
Mostrar fecha (solo texto: Funcionalidad no implementada)
Salir
El menú debe repetirse hasta que el usuario elija 0.

Requisitos:

Usar do-while.
Si opción inválida, mostrar Opción inválida.
 * @author EMILY RIVERA 
 * @version 1.0
 */
import java.util.Scanner;

public class DO_WHILE {
    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = tcl.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola, bienvenido");
                    break;

                case 2:
                    System.out.println("Funcionalidad no implementada");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

    }
}
/**
 * run:
MENU
1. Saludar
2. Mostrar fecha
0. Salir
Ingrese una opcion: 1
Hola, bienvenido ?
MENU
1. Saludar
2. Mostrar fecha
0. Salir
Ingrese una opcion: 2
Funcionalidad no implementada
MENU
1. Saludar
2. Mostrar fecha
0. Salir
Ingrese una opcion: 0
Saliendo del programa...
 */