
package ARREGLOS_UNIDIMENSIONALES;

import java.util.Scanner;

/**
 * ArregloRecorrido.java – Mostrar y contar
Problema: Con un arreglo de N enteros (cargado por teclado):

Mostrar todos los valores
Contar cuántos son pares y cuántos impares
Requisitos:

Mostrar al final: Pares: X, Impares: Y.

 * @author EMILY RIVERA
 * @version 1.0
 */
public class ARREGLO_RECORRIDO {

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        int n;

        System.out.print("Ingrese N: ");
        n = tcl.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese NUMERO " + (i + 1) + ": ");
            a[i] = tcl.nextInt();
        }

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);

            if (a[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares + ", Impares: " + impares);
    }
}
/**
 * run:
Ingrese N: 4
Ingrese NUMERO 1: 5
Ingrese NUMERO 2: 3
Ingrese NUMERO 3: 2
Ingrese NUMERO 4: 4
5
3
2
4
Pares: 2, Impares: 2
 */
