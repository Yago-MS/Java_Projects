package repaso45;

import java.util.Scanner;

public class Repaso45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numVuel = 0, numFinal = 0;
        int dig, digCambi, cont = 0, numCambi;
        do {
            System.out.println("Inserte un numero:");
            num = sc.nextInt();
        } while (num < 0);

        while (num > 0) {
            dig = num % 10;
            numVuel = numVuel * 10 + dig;
            num /= 10;
            cont++;
        }

        do {
            System.out.println("Introduzca el digito a cambiar:");
            digCambi = sc.nextInt();
        } while (digCambi > cont || digCambi <= 0);
        do {
            System.out.println("Introduzca el nuevo digito:");
            numCambi = sc.nextInt();
        } while (num < 0);

        cont = 0;

        while (numVuel > 0) {
            cont++;
            dig = numVuel % 10;
            if (cont == digCambi) {
                numFinal = numFinal * 10 + numCambi;
            } else {
                numFinal = numFinal * 10 + dig;
            }
            numVuel /= 10;
        }
        System.out.println("El numero resultante es:" + numFinal);
    }
}
