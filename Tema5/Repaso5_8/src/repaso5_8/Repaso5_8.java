//por YAGO
package repaso5_8;

import java.util.Scanner;

public class Repaso5_8 {

    public static void colocarDiagonales(int[][] tabla, int posX, int posY) {
        int copyX = posX, copyY = posY;
        while (posX < tabla.length && posY < tabla[0].length) {

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[8][8];

        System.out.println("En que posición está el alfil? (X)");
        int posicionX = sc.nextInt();
        System.out.println("En que posición está el alfil? (Y)");
        int posicionY = sc.nextInt();

        // Pintar tablero
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = 0;
            }
        }

        tablero[posicionX][posicionY] = 1;

        for (int i = 1; i < 8; i++) {

            if (posicionX - i >= 0 && posicionY + i < 8) {
                tablero[posicionX - i][posicionY + i] = 2;
            }

            if (posicionX - i >= 0 && posicionY - i >= 0) {
                tablero[posicionX - i][posicionY - i] = 2;
            }

            if (posicionX + i < 8 && posicionY + i < 8) {
                tablero[posicionX + i][posicionY + i] = 2;
            }

            if (posicionX + i < 8 && posicionY - i >= 0) {
                tablero[posicionX + i][posicionY - i] = 2;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    

    
