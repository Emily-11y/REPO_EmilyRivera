
package ESTRUCTURAS_SELECTIVAS;

import java.util.Scanner;

/**
 * IfDoble.java – Aprobado / Reprobado Problema: Ingrese una nota final (0–100).
 * Si la nota es >= 70, muestre Aprobado; caso contrario, Reprobado.
 *
 * Requisitos:
 *
 * Validar rango 0–100. Si no cumple, mostrar Nota inválida y terminar. Usar if
 * doble (if/else). Ejemplo:
 *
 * 85 → Aprobado 60 → Reprobado 120 → Nota inválida
 * @author EMILY RIVERA
 * @version 1.0
 */
public class IF_DOBLE {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double nota;
        System.out.println("INGRESE LA NOTA FINAL:(0-100)");
        nota = tcl.nextInt();

         if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida");
        } else {
            if (nota >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }

    }
}
/**
 * run:
INGRESE LA NOTA FINAL:(0-100)
98
Aprobado

 */