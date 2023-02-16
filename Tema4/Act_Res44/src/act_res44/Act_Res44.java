//por YAGO
package act_res44;

import java.util.Scanner;

public class Act_Res44 {

    public static int max(int num1, int num2) {
        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Inserte el primer numero:");
        num1 = sc.nextInt();
        System.out.println("Inserte el segundo número:");
        num2 = sc.nextInt();

        int max = max(num1, num2);
        System.out.println("El numero mayor es:" + max);
    }

}
