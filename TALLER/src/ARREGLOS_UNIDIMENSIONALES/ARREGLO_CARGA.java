
package ARREGLOS_UNIDIMENSIONALES;

import java.util.Scanner;

/**
 * ArregloCarga.java – Cargar N valores
Problema: Solicite N (1..50). Cree un arreglo de N enteros y cargue valores 
* por teclado.

Requisitos:

Validar N en rango.
Al finalizar, mostrar Carga completada.
 * @author EMILY RIVERA
 * @version 1.0
 */
public class ARREGLO_CARGA {

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        int n;

        System.out.print("Ingrese N: ");
        n = tcl.nextInt();

        if (n >= 1 && n <= 50) {

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("INGRESE EL VALOR:"+ i);
                a[i] = tcl.nextInt();
            }

            System.out.println("Carga completada");

        } else {
            System.out.println("Valor invalido");
        }
    }
} 
/**
 * run:
Ingrese N: 4
INGRESE EL VALOR:0
75
INGRESE EL VALOR:1
20
INGRESE EL VALOR:2
6
INGRESE EL VALOR:3
78
Carga completada
 */
