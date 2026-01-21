
package ARREGLOS_BIDIMENSIONALES;

import java.util.Scanner;

/**
 * MatrizRecorrido.java – Mostrar matriz y suma por fila
Problema: Con una matriz M x N (cargada por teclado):

Mostrar la matriz en formato de tabla
Calcular la suma de cada fila y mostrarla
Requisitos:

Formato sugerido:
Fila 1 -> suma = ...
Fila 2 -> suma = ...

 * @author EMILY RIVERA
 * @version 1.0
 */
public class Matriz_Recorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int M, N, sumaFila;
        System.out.print("Ingrese numero de filas: ");
        M = tcl.nextInt();
        System.out.print("Ingrese numero columas: ");
        N = tcl.nextInt();

        int[][] matriz = new int[M][N];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese valor: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        System.out.println("\nMATRIZ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                 System.out.print(matriz[i][j]+"\t");
            }
        System.out.println("");    
        }
        for (int i = 0; i < matriz.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila = sumaFila + matriz[i][j];
            }
            System.out.println("suma fila= " + sumaFila);
        }
    }
}
/**
 * run:
Ingrese numero de filas: 2
Ingrese numero columas: 2
Ingrese valor: 45
Ingrese valor: 56
Ingrese valor: 12
Ingrese valor: 100

MATRIZ
45	56	
12	100	
suma fila= 101
suma fila= 112
 * 
 */
