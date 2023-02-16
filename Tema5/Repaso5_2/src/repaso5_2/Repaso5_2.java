//por YAGO
package repaso5_2;

import java.util.Arrays;
import static repaso5_2.BibliotecaArraysActualizada.*;

public class Repaso5_2 {

    public static int sumaFilas(int[][] tabla) {
        int sumaFilas = 0;
        
        for (int indice1 = 0; indice1 < tabla.length; indice1++) {
            int suma = 0;
            for (int indice2 = 0; indice2 < tabla[0].length; indice2++) {
                suma += tabla[indice1][indice2];
                
            }
            sumaFilas = sumaFilas + suma;
            System.out.println("la suma parcial de la fila nº" + (indice1+1) + " es " + suma);
        }
        return sumaFilas;
    }

    public static int sumaColumnas(int[][] tabla) {
        int sumaColumnas = 0;
        for (int indice1 = 0; indice1 < tabla[0].length; indice1++) {
            int suma = 0;
            for (int indice2 = 0; indice2 < tabla.length; indice2++) {
            suma += tabla[indice2][indice1];
            }
            sumaColumnas += suma;
            System.out.println("la suma parcial de la columna nº" + (indice1+1) + " es " + suma);
        }
        return sumaColumnas;
    }

    public static void main(String[] args) {
        int[][] tabla = new int[4][5];
        int sumaFilas, sumaColumnas;
        leeTabla2D(tabla);
        sumaFilas = sumaFilas(tabla);
        sumaColumnas = sumaColumnas(tabla);
        

        System.out.println("El total es: " + (sumaColumnas));

    }

}
