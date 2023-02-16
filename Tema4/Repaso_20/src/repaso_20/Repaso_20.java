package repaso_20;

import java.util.Scanner;

public class Repaso_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char simbolo;
        int numero;
        do {
            System.out.print("Introduzca un numero(no valen negativos ni 0): ");
            numero = sc.nextInt();
            System.out.print("Introduzca el simbolo: ");
            sc.nextLine();
            simbolo = sc.next().charAt(0);
        } while (numero <= 0);
        for (int excepcion = 0; excepcion <= numero; excepcion++) {
            System.out.print(" ");
        }
        System.out.println(simbolo);
        for (int altura = 1; altura < numero - 1; altura++) {
            for (int espacio = 0; espacio < numero - altura; espacio++) {
                System.out.print(" ");
            }
            System.out.print(simbolo + " ");
            for (int columna = 1; columna <= (altura * 2); columna++) {
                System.out.print(" ");
            }
            System.out.print(simbolo + " ");
            System.out.println("");
        }
        System.out.print(" ");
        for (int base = 0; base <= numero; base++) {
            System.out.print(simbolo + " ");
        }
        System.out.println("");
    }

}
