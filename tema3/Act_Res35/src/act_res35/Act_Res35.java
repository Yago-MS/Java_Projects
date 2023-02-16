package act_res35;

import java.util.Scanner;

public class Act_Res35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, respUser, respJava, totCorrectas=-1;

        do {
            num1 = (int) (Math.random() * 100 +1);
            num2 = (int) (Math.random() * 100 +1);
            respJava = num1 + num2;
            System.out.println("suma" + num1 + "+" + num2);
            respUser = sc.nextInt();
            totCorrectas++;
        } while (respUser == respJava);

        if (totCorrectas > 0) {
            System.out.println("¡Bien hecho! has respondido bien:" + totCorrectas);
        } else {
            System.out.println("Intentalo de nuevo");
        }
    }

}
