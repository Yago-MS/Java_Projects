//por YAGO
package act_prop53;

import java.util.Scanner;

public class Act_Prop53 {

    public static void main(String[] args) {
        int contCero = 0, contPos = 0, contNeg = 0, totalPos = 0, totalNeg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insete un numero");
        int numN = sc.nextInt();
        int tabla[] = new int[numN];

        for (int indice = 0; indice < tabla.length; indice++) {
            System.out.println("inserte un otro numero");
            tabla[indice] = sc.nextInt();
            if (tabla[indice] == 0) {
                contCero++;
            }
            if (tabla[indice] > 0) {
                totalPos += tabla[indice];
                contPos++;
            }
            if (tabla[indice] < 0) {
                totalNeg += tabla[indice];
                contNeg++;
            }
            if (contPos == 0) {
                contPos++;
            }
            if (contNeg == 0) {
                contNeg++;
            }
        }
        System.out.println("La media de los positivos es " + ((double)totalPos / contPos));
        System.out.println("La media de los negativos es " + ((double)totalNeg / contNeg));
        System.out.println("La cantidad de ceros es " + contCero);
    }

}
