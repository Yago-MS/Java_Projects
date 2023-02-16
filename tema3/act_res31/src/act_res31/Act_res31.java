package act_res31;

import java.util.Scanner;

public class Act_res31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rest, cua;
        System.out.println("Introduzca su numero");
        num = sc.nextInt();

        while (num != 0) {

            rest = num % 2;
            if (rest == 0) {
                System.out.println("es par");
            } else {
                System.out.println("es impar");
            }

            if (num < 0) {
                System.out.println("es negativo");
            } else {
                System.out.println("es positivo");
            }
            cua = num * num;

            System.out.println("el cuadrado del numero es:" + cua);

            System.out.println("Introduzca su numero");
            num = sc.nextInt();
        }

    }

}
