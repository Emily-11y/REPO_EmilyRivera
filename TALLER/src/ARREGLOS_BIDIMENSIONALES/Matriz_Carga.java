
package ARREGLOS_BIDIMENSIONALES;

/**
 *MatrizCarga.java – Crear y llenar una matriz
Problema: Solicite filas f (1..10) y columnas c (1..10). 
* Cree una matriz f x c de enteros y llénela por teclado.

Requisitos:

Validar rangos.
Al finalizar, mostrar Matriz cargada.
 * @author EMILY RIVERA
 * @version 1.0
 */
import java.util.Scanner;

public class Matriz_Carga {
    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        int f, c;
        System.out.print("Ingrese N filas (1 al 10): ");
        f = tcl.nextInt();
        System.out.print("Ingrese N columnas (1..10): ");
        c = tcl.nextInt();

        if (f < 1 || f > 10 || c < 1 || c > 10) {
            System.out.println("Valores fuera de rango");
        } else {
            int[][] matriz = new int[f][c];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print("Ingrese valor: ");
                    matriz[i][j] = tcl.nextInt();
                }
            }
            System.out.println("Matriz cargada");
            for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                 System.out.print(matriz[i][j]+"\t");
            }
        System.out.println("");    
        }
        }
        }
    }
/**
 * run:
Ingrese N filas (1 al 10): 2
Ingrese N columnas (1..10): 2
Ingrese valor: 78
Ingrese valor: 45
Ingrese valor: 12
Ingrese valor: 100

Matriz cargada
78	45	
12	100	
 * 
 */