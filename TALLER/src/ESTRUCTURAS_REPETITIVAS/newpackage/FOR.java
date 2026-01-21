
package ESTRUCTURAS_REPETITIVAS.newpackage;

/**
 *ForBasico.java – Tabla de multiplicar
Problema: Solicite un número entero n y muestre su tabla del 1 al 12.

Requisitos:

Usar for.
Validar que n sea positivo.
Salida esperada (formato sugerido): n x i = resultado
 * @author EMILY RIVERA
 * @version 1.0
 */
import java.util.Scanner;

public class FOR {
    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        int n;

        System.out.print("Ingrese un numero entero positivo: ");
        n = tcl.nextInt();

        if (n <= 0) {
            System.out.println("Numero invalido");
        } else {
            for (int i = 1; i <= 12; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}
/**
 * run:
Ingrese un numero entero positivo: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
5 x 11 = 55
5 x 12 = 60
 */