//por YAGO
package repaso5_6;

import java.util.Arrays;
import static repaso5_6.BibliotecaArraysActualizada.*;

public class Repaso5_6 {

    public static int encuentraMayor2D(int[][] tabla) {
        int mayor = 0;

        for (int indice1 = 0; indice1 < tabla.length; indice1++) {
            for (int indice2 = 0; indice2 < tabla[0].length; indice2++) {
                if (tabla[indice1][indice2] > mayor) {
                    mayor = tabla[indice1][indice2];
                }

            }
        }

        return mayor;
    }

    public static int encuentraMenor2D(int[][] tabla) {
        int menor = 1001;
        for (int indice1 = 0; indice1 < tabla.length; indice1++) {
            for (int indice2 = 0; indice2 < tabla[0].length; indice2++) {

                if (tabla[indice1][indice2] < menor) {
                    menor = tabla[indice1][indice2];
                }
            }
        }

        return menor;
    }
    
    public static void main(String[] args) {
        int[][] tabla = new int[10][10];
        tablaRandom2DSinRepe(tabla);
        
//        int menor=encuentraMenor2D(tabla);
//        int mayor=encuentraMayor2D(tabla);
//        
//        System.out.println("El menor es " + menor);
//        System.out.println("El mayor es " + mayor);
      for (int indice1 = 0; indice1 < tabla.length; indice1++) {
            for (int indice2 = 0; indice2 < tabla[0].length; indice2++) {
                
                System.out.print(tabla[indice1][indice2] + " ");
            }
            System.out.println("");
        }
        
       
        
    }

}
