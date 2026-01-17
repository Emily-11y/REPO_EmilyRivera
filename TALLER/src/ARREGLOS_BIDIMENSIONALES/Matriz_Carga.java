
package ARREGLOS_BIDIMENSIONALES;

/**
 *
 * @author Emily R
 */
import java.util.Scanner;

public class Matriz_Carga {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int f, c;


        do {
            System.out.print("Ingrese el número de filas (1 a 10): ");
            f = teclado.nextInt();
        } while (f < 1 || f > 10);

   
        do {
            System.out.print("Ingrese el número de columnas (1 a 10): ");
            c = teclado.nextInt();
        } while (c < 1 || c > 10);

   
        int matriz[][] = new int[f][c];

   
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        
        System.out.println("Matriz cargada");

    }
}
/**
 * RUN: 
 * 
 */