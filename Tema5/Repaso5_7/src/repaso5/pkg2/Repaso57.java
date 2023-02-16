package repaso5.pkg2;

import java.util.Scanner;

public class Repaso57 {

    
    public static void generarCasillas(int[][] tabla) {
        int minaX, minaY, tesoroX, tesoroY, cont = 0;

        while (cont < 10) {
            minaX = (int) (Math.random() * 10);
            minaY = (int) (Math.random() * 10);
            if (tabla[minaX][minaY] != 1) {
                tabla[minaX][minaY] = 1;
                cont++;
            }
        }
        cont =0;
        while (cont < 1) {
            tesoroX = (int) (Math.random() * 11);
            tesoroY = (int) (Math.random() * 11);
            if (tabla[tesoroX][tesoroY] != 1) {
                tabla[tesoroX][tesoroY] = 2;
                cont++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[10][10];
        generarCasillas(tablero);
        
        int[] posicion = {0, 0};
        for (int indice1 = 0; indice1 < tablero.length; indice1++) {
            for (int indice2 = 0; indice2 < tablero[0].length; indice2++) {
                
                System.out.print(tablero[indice1][indice2] + " ");
            }
            System.out.println("");
        }
        boolean tesoroEncontrado = false;
        while (!tesoroEncontrado) {
            System.out.println("Ingrese la posición x (fila) del tablero (1-10): ");
            posicion[0] = (sc.nextInt() -1);
            System.out.println("Ingrese la posición y (columna) del tablero (1-10): ");
            posicion[1] = (sc.nextInt() -1);

            if (tablero[posicion[0]][posicion[1]] == 1) {
                System.out.println("¡Oh no! Has encontrado una mina. ¡Perdiste!");
                tesoroEncontrado = true;
            } else if (tablero[posicion[0]][posicion[1]] == 2) {
                System.out.println("¡Felicidades! Has encontrado el tesoro. ¡Ganaste!");
                tesoroEncontrado = true;
            } else {
                System.out.println("Has elegido una casilla vacía.");
                // Verificar casillas adyacentes
                if (posicion[0] > 0) {
                    if (tablero[posicion[0] - 1][posicion[1]] == 1) {
                        System.out.println("¡Cuidado! ¡Hay una mina cerca!");
                    }
                }
                if (posicion[0] < tablero.length - 1) {
                    if (tablero[posicion[0] + 1][posicion[1]] == 1) {
                        System.out.println("¡Cuidado! ¡Hay una mina cerca!");
                    }
                }
                if (posicion[1] > 0) {
                    if (tablero[posicion[0]][posicion[1] - 1] == 1) {
                        System.out.println("¡Cuidado! ¡Hay una mina cerca!");
                    }
                }
                if (posicion[1] < tablero[posicion[0]].length - 1) {
                    if (tablero[posicion[0]][posicion[1] + 1] == 1) {
                        System.out.println("¡Cuidado! ¡Hay una mina cerca!");
                    }
                }
            }
        }
    }
}
