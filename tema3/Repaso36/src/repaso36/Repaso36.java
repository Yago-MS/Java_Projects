package repaso36;

import java.util.Scanner;

public class Repaso36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, comparar, numVuel = 0, dig;
        do {

            System.out.println("Inserte un numero");
            comparar = num = sc.nextInt();
        } while (num < 0);

        while (num > 0) {
            dig = num % 10;
            numVuel = numVuel * 10 + dig;
            num /= 10;
        }
        if (comparar == numVuel) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }

    }

}
