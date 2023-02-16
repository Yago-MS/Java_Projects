package act_repaso11;

import java.util.Scanner;

public class Act_Repaso11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h, m, s, secRestantes;

        System.out.println("Inserte las horas");
        h = sc.nextInt();
        System.out.println("Inserte los minutos");
        m = sc.nextInt();
        if (h >= 24 || m >= 60) {

            System.out.println("Introduzca datos válidos");
        } else {
            s = h * 3600 + m * 60;
            secRestantes = 86400 - s;
            System.out.println("quedan:" + secRestantes + "segundos");
        }

    }

}
