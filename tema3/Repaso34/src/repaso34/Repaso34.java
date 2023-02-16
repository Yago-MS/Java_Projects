package repaso34;

import java.util.Scanner;

public class Repaso34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1, num2, pares = 0, impares = 0, dig, numVuel1 = 0, numVuel2 = 0;
        System.out.println("Inserte un numero");
        num1 = sc.nextLong();
        System.out.println("Inserte otro numero");
        num2 = sc.nextLong();
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        while (num1 > 0) {
            dig = num1 % 10;
            numVuel1 = numVuel1 * 10 + dig;
            num1 /= 10;
        }
        while (num2 > 0) {
            dig = num2 % 10;
            numVuel2 = numVuel2 * 10 + dig;
            num2 /= 10;
        }

        while (numVuel1 > 0 || numVuel2 > 0) {
            dig = numVuel1 % 10;
            if (dig != 0) {
                if (dig % 2 == 0) {
                    pares = pares * 10 + dig;
                } else {
                    impares = impares * 10 + dig;
                }
            }
            numVuel1 /= 10;
            dig = numVuel2 % 10;
            if (dig != 0) {
                if (dig % 2 == 0) {
                    pares = pares * 10 + dig;
                } else {
                    impares = impares * 10 + dig;
                }
            }
            numVuel2 /= 10;
        }
        System.out.println("los pares son:" + pares);
        System.out.println("los impares son:" + impares);

    }

}
