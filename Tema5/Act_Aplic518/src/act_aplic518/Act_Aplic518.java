//por YAGO
package act_aplic518;

import static act_aplic518.BibliotecaArraysActualizada.leeTabla2D;

public class Act_Aplic518 {

    public static void compruebaMagico(int[][] tabla) {
        boolean esMagico = true;
        int suma = 0;

        for (int indice = 0; indice < tabla.length; indice++) {
            suma += tabla[0][indice];
        }

        for (int indice1 = 0; indice1 < tabla.length && esMagico == true; indice1++) {
            int sumaFilas = 0;
            for (int indice2 = 0; indice2 < tabla[0].length; indice2++) {
                sumaFilas += tabla[indice1][indice2];
            }
            if (sumaFilas != suma) {
                esMagico = false;
            }
        }
        for (int indice1 = 0; indice1 < tabla[0].length && esMagico == true; indice1++) {
            int sumaColumnas = 0;
            for (int indice2 = 0; indice2 < tabla.length; indice2++) {
                sumaColumnas += tabla[indice1][indice2];
            }
            if (sumaColumnas != suma) {
                esMagico = false;
            }
        }
        if (esMagico) {
            System.out.println("El cuadrado es mágico");
        } else {
            System.out.println("El cuadrado no es mágico");
        }

    }

    public static void main(String[] args) {
        int[][] cuadradoMagico = new int[4][4];

        leeTabla2D(cuadradoMagico);
        compruebaMagico(cuadradoMagico);

    }

}
