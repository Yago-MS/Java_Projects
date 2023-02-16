//por YAGO
package act_aplic511;

import java.util.Arrays;

public class Act_Aplic511 {
    public static int contarClaves(int[] tabla, int clave){
     int longitud=0;
        for (int indice = 0; indice < tabla.length; indice++) {
            if (tabla[indice] == clave) {
                longitud++;
            }
        }
    return longitud;
    }
    public static int[] seleccion(int[] tabla, int busqueda) {
        int longitud = 0, indice2 = 0;
       
        int[] coincidencias = new int[contarClaves(tabla, busqueda)];

        for (int indice = 0; indice < tabla.length; indice++) {
            if (tabla[indice] == busqueda) {
                coincidencias[indice2] = indice;
                indice2++;
            }
        }
        return coincidencias;
    }

    public static void main(String[] args) {
        int[] tabla = new int[]{1, 2, 3, 4, 4, 4, 4, 8, 9, 10};
        int[] indice = new int[tabla.length];
        int busqueda = 4;
        System.out.println(Arrays.toString(seleccion(tabla, busqueda)));

    }

}