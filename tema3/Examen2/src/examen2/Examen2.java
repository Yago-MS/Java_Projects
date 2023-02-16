//por YAGO
package examen2;

import java.util.Scanner;

public class Examen2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numReves = 0, result = 0;
        char repetir = 's';

        do {
            System.out.println("Introduzca un numero");
            num = sc.nextInt();
        } while (num <= 0);

        for (int dig; num > 0;) {
            dig = num % 10;
            numReves = numReves * 10 + dig;
            num /= 10;
        }

        do {
            for (int dig = 0; numReves > 0;) {
                dig = numReves % 10;
                System.out.print(dig);
                result = result + dig;
                numReves /= 10;
                if (numReves > 0) {
                    System.out.print(" + ");
                }

            }
            System.out.println(" = " + result);
            System.out.println("salir? (pulse 's' para salir)");
            sc.nextLine();
            repetir = sc.nextLine().charAt(0);
            if (repetir != 's') {
                do {
                    System.out.println("Inserte un nuevo numero");
                    numReves = sc.nextInt();
                } while (numReves < 0);
                result = 0;
            }
        } while (repetir != 's');
        System.out.println("terminaste");
    }

}
