//por YAGO
package examen1;

import java.util.Scanner;

public class Examen1 {

    public static void main(String[] args) {
        int num, crap = 0, numAux;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca un numero");
            num = sc.nextInt();
        } while (num < 0);

        numAux = num;

        for (int dig; numAux > 0;) {
            dig = numAux % 10;
            crap = crap + dig;
            numAux /= 10;
        }
        do {
            numAux = crap;
            crap = 0;
            for (int dig; numAux > 0;) {
                dig = numAux % 10;
                crap = crap + dig;
                numAux /= 10;
            }
            if (numAux > 9) {
                crap = numAux;
            }
        } while (crap > 9);
        System.out.println(crap);
    }

}
