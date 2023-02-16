//por YAGO
package exament5_2;

import java.util.Scanner;

public class ExamenT5_2 {

    public static int numAleatorio(int min, int max) {
        int num;

        num = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(num);
        return num;
    }

    public static void inicializaArray(char[][] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = 'X';
            }
        }

    }

    public static void muestraArray(char tabla[][]) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " | ");
            }
            System.out.println("");
        }

    }

    public static int insertaFicha(char[][] tabla, int columna, char jugador) {
        int fila = tabla.length - 1;
        if (columna <= tabla[fila].length - 1 && columna >= 0) {
            while (tabla[fila][columna] != 'X' && fila >= 1) {
                fila--;
            }

            if (tabla[fila][columna] != 'R' && tabla[fila][columna] != 'A') {
                tabla[fila][columna] = jugador;
            } else {
                System.out.println("columna llena!");
            }
        } else {
            System.out.println("te has salido del tablero de juego");
        }
        return fila;
    }

    public static void reversi(char[][] tabla, int fila, int col, char jugador) {
        if (col >= 0 && col < tabla[fila].length) {
            if (fila > 0) {
                if (tabla[fila - 1][col] != jugador && tabla[fila - 1][col] != 'X') {
                    tabla[fila - 1][col] = jugador;
//                System.out.println("deberia cambiar");
                }
            }
            if (fila < tabla.length - 1) {
                if (tabla[fila + 1][col] != jugador && tabla[fila + 1][col] != 'X') {
                    tabla[fila + 1][col] = jugador;
//                System.out.println("deberia cambiar");
                }
            }
            if (col > 0) {
                if (tabla[fila][col - 1] != jugador && tabla[fila][col - 1] != 'X') {
                    tabla[fila][col - 1] = jugador;
                    //System.out.println("deberia cambiar");
                }
            }
            if (col < tabla[fila].length - 1) {
                if (tabla[fila][col + 1] != jugador && tabla[fila][col + 1] != 'X') {
                    tabla[fila][col + 1] = jugador;
                    //System.out.println("deberia cambiar");
                }
            }
            if (fila > 0 && col > 0) {
                if (tabla[fila - 1][col - 1] != jugador && tabla[fila - 1][col - 1] != 'X') {
                    tabla[fila - 1][col - 1] = jugador;
                    //System.out.println("deberia cambiar");
                }
            }
            if (fila > 0 && col < tabla[fila].length - 1) {
                if (tabla[fila - 1][col + 1] != jugador && tabla[fila - 1][col + 1] != 'X') {
                    tabla[fila - 1][col + 1] = jugador;
                    //System.out.println("deberia cambiar");
                }
            }
            if (fila < tabla.length - 1 && col < tabla[fila].length - 1) {
                if (tabla[fila + 1][col + 1] != jugador && tabla[fila + 1][col + 1] != 'X') {
                    tabla[fila + 1][col + 1] = jugador;
                }
            }
            if (fila < tabla.length - 1 && col > 0) {
                if (tabla[fila + 1][col - 1] != jugador && tabla[fila + 1][col - 1] != 'X') {
                    tabla[fila + 1][col - 1] = jugador;
                    //System.out.println("deberia cambiar");
                }
            }
        }

    }

    public static boolean finJuego(char tabla[][]) {
        boolean fin = true;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] == 'X') {
                    fin = false;
                }
            }
        }

        return fin;
    }

    public static void ganador(char[][] tabla) {
        int azules = 0, rojos = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] == 'A') {
                    azules++;
                } else {
                    rojos++;
                }
            }
        }
        if (azules > rojos) {
            System.out.println("Las azules han ganado!");
        } else {
            System.out.println("Los rojos han ganado!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cols, filas;

        filas = numAleatorio(4, 8);
        cols = numAleatorio(4, 8);

        char[][] tablero = new char[filas][cols];

        inicializaArray(tablero);

        System.out.println("inicia el juego!");
        muestraArray(tablero);

        char jugadorActual = 'A';
        System.out.println("Por defecto empieza el jugador Azul");
        do {

            System.out.println("Inserte columna(1-" + cols + ")");
            int col = sc.nextInt() - 1;
            int filaActual = insertaFicha(tablero, col, jugadorActual);
            reversi(tablero, filaActual, col, jugadorActual);
            muestraArray(tablero);

            if (jugadorActual == 'A') {
                jugadorActual = 'R';
            } else {
                jugadorActual = 'A';
            }
            System.out.println("turno del jugador" + jugadorActual);
        } while (!finJuego(tablero));

        ganador(tablero);
    }

}
