
package ESTRUCTURAS_SELECTIVAS;

import java.util.Scanner;

/**
 * SwitchCase.java – Menú de opciones (operación con 2 números)
Problema: Construya un menú:

Sumar
Restar
Multiplicar
Dividir
Solicite al usuario una opción (1–4) y dos números (double). 
* Ejecute la operación y muestre el resultado.

Requisitos:

Usar switch-case.
En división, si el segundo número es 0, mostrar No se puede dividir para cero.
Si opción inválida, mostrar Opción inválida.
Ejemplo:

Opción 1, números 5 y 3 → Resultado: 8
 * @author EMILY RIVERA
 * @version 1.0
 */
public class SWITCH {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        double num1, num2, respuesta = 0;
        System.out.println("INGRESE UN NUMERO DEL 1 (SUMAR), 2 (RESTAR), 3 (MULTIPLICAR), 4 (DIVIDIR)");
        opcion = tcl.nextInt();
        System.out.println("INGRESE PRIMER NUMERO");
        num1 = tcl.nextDouble();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        num2 = tcl.nextDouble();
        switch (opcion) {
            case 1:
                respuesta = (num1 + num2);
                System.out.println("LA RESPUESTA ES:" + respuesta);
                break;
            case 2:
                respuesta = (num1 - num2);
                System.out.println("LA RESPUESTA ES:" + respuesta);
                break;
            case 3:
                respuesta = (num1 * num2);
                System.out.println("LA RESPUESTA ES:" + respuesta);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("NO SE PUEDE DIVIDIR PARA CERO");
                } else {
                    respuesta = (num1 / num2);
                }
                System.out.println("LA RESPUESTA ES:" + respuesta);
                break;
            default:
                System.out.println("OPCION INVÁLIDA");
        }
    }
}
/**
 * RUN: 
INGRESE UN NUMERO DEL 1 (SUMAR), 2 (RESTAR), 3 (MULTIPLICAR), 4 (DIVIDIR)
3
INGRESE PRIMER NUMERO
5
INGRESE EL SEGUNDO NUMERO
2
LA RESPUESTA ES:10.0
 */
