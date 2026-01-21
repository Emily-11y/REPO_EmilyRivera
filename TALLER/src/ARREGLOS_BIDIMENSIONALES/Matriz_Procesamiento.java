
package ARREGLOS_BIDIMENSIONALES;

import java.util.Random;

/**
 * MatrizProcesamiento.java – Suma total y diagonal (si aplica)
Problema: Con una matriz f x c:

Calcular suma total de elementos
Si la matriz es cuadrada (f==c), calcular suma de la diagonal principal
Requisitos:

Si no es cuadrada, mostrar Diagonal no aplica.
 * @author EMILY RIVERA
 * @version 1.0
 */
public class Matriz_Procesamiento  {
    public static void main(String[] args) {
        Random ale = new Random();
        int m = 3, n = 3, sumaDiagonal, sumaTotal ; 
        int[][] matriz = new int[m][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = ale.nextInt(9);
            }
        }
        System.out.println("MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        sumaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("SUMA TOTAL: " + sumaTotal);

        if (m == n) {
            sumaDiagonal = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("SUMA DIAGONAL PRINCIPAL: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica");
        }
    }
}
/**
 * run:
MATRIZ
7	2	2	
8	2	6	
8	6	5	
SUMA TOTAL: 46
SUMA DIAGONAL PRINCIPAL: 14
 */
