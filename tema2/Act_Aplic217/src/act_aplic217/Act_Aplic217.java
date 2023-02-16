package act_aplic217;

import java.util.Scanner;

public class Act_Aplic217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, respUser, respJava;
        int juego;
        juego = (int) (Math.random() * 3) + 1;
        num1 = (int) (Math.random() * 99) + 1;
        num2 = (int) (Math.random() * 99) + 1;

        if (juego == 1) {
            System.out.println("suma" + num1 + "+" + num2);
            respUser = sc.nextInt();
            respJava = num1 + num2;
            if (respUser == respJava) {

                System.out.println("es correcto");

            } else {
                System.out.println("es incorrecto");
            }
        } else if (juego == 2) {
            System.out.println("resta:" + num1 + "-" + num2);
            respUser = sc.nextInt();
            respJava = num1 - num2;
            if (respUser == respJava) {

                System.out.println("es correcto");

            } else {
                System.out.println("es incorrecto");
            }

        } else if (juego == 3) {
            System.out.println("multipica" + num1 + "x" + num2);
            respUser = sc.nextInt();
            respJava = num1 * num2;
            if (respUser == respJava) {

                System.out.println("es correcto");

            } else {
                System.out.println("es incorrecto");
            }

        }
    }
}
