package act_aplic312;

import java.util.Scanner;

public class Act_Aplic312 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numD = 0, numB = 0, cont = 0, cifraB = 0, cifraD = 0;

        System.out.println("Introduzca el numero");
        numB = sc.nextLong();

        while (numB != 0) {
            cifraB = numB % 10;
            cifraD = (cifraB * ((long) Math.pow(2, cont)));
            numD = numD + cifraD;
            cont++;
            numB = numB / 10;
        }

        System.out.println(numD);
    }

}
