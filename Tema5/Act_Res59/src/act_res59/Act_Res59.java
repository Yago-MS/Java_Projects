//por YAGO
package act_res59;

import java.util.Arrays;
import java.util.Scanner;

public class Act_Res59 {

    public static void copiaTabla(int[] tablaOrigen, int posOrigen, int[] tablaDestino, int posDestino, int longitud) {

        for (int indice = 0; indice < longitud; indice++) {
            tablaDestino[posDestino + indice] = tablaOrigen[posOrigen + indice];
        }

    }

    public static int[] insercionOrdenada(int[] tabla, int num) {
        int indiceInsercion = Arrays.binarySearch(tabla, num);
        if (indiceInsercion < 0) {
            indiceInsercion = -indiceInsercion - 1;

        }
        int[] copia = new int[tabla.length + 1];
        copiaTabla(tabla, 0, copia, 0, indiceInsercion);
        copiaTabla(tabla, indiceInsercion, copia, indiceInsercion + 1, tabla.length - indiceInsercion);
        copia[indiceInsercion] = num;
        tabla = copia;
        return tabla;
    }

    public static void mostrarArray(int[] tabla) {
        for (int indice = 0; indice < tabla.length; indice++) {
            System.out.print(tabla[indice] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] puntuaciones = new int[0];
        int puntuacion;
        for (int cont = 0; cont < 5; cont++) {
            do{
            System.out.println("Inserte puntuacion:");
            puntuacion = sc.nextInt();
        }while(puntuacion > 0);
                puntuaciones = insercionOrdenada(puntuaciones, puntuacion);
        }

        do {
            System.out.println("Inserte puntuacion exhibicion:");
            puntuacion = sc.nextInt();
            if (puntuacion > 0) {
                puntuaciones = insercionOrdenada(puntuaciones, puntuacion);
            }
        } while (puntuacion > 0);
        mostrarArray(puntuaciones);
    }

}
