//por YAGO
package repaso5_10;

import java.util.Scanner;

public class Repaso5_10 {

    public static boolean ganador(char[][] tablero) {
        // Comprobar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != ' ') {
                return true;
            }
        }

        // Comprobar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j] && tablero[0][j] != ' ') {
                return true;
            }
        }

        // Comprobar diagonales
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ') {
            return true;
        }
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {
            return true;
        }
        return false;
    }

    public static boolean empate(char[][] tablero) {
        int jugadas = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] != ' ') {
                    jugadas++;
                }
            }
        }
        if (jugadas == 9) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        char[][] tablero = {{' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}};

        char jugadorActual = 'X';
        int jugadas = 0;

        while (!ganador(tablero) && !empate(tablero)) {
            // Mostrar tablero
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + "|");
                }
                System.out.println();
            }

            // Pedir posición
            System.out.print("Jugador " + jugadorActual + ", ingresa la posición (fila columna): ");
            Scanner scan = new Scanner(System.in);
            int posicionFila = scan.nextInt();
            int posicionColumna = scan.nextInt();

            //Validar que la posicion no esta ocupada
            if (tablero[posicionFila][posicionColumna] != ' ') {
                System.out.println("Posicion ocupada, ingrese otra posicion");
                continue;
            }

            // Marcar posición
            tablero[posicionFila][posicionColumna] = jugadorActual;
            jugadas++;

            // Cambiar jugador
            if (jugadorActual == 'X') {
                jugadorActual = 'O';
            } else {
                jugadorActual = 'X';
            }
        }

        // Mostrar resultado
        if (ganador(tablero)) {
             if (jugadorActual == 'X') {
                jugadorActual = 'O';
            } else {
                jugadorActual = 'X';
            }
            System.out.println("Gana el jugador " + jugadorActual);
        } else if (empate(tablero)) {
            System.out.println("Empate");
        }
    }

}
