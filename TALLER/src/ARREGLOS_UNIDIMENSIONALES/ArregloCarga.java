
package ARREGLOS_UNIDIMENSIONALES;

/**
 *
 * @author Emily R
 */
import java.util.Scanner;

public class ArregloCarga {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int N;

        
        do {
            System.out.print("Ingrese el valor de N (1 a 50): ");
            N = entrada.nextInt();
        } while (N < 1 || N > 50);


        int[] arreglo = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("Carga completada.");
}