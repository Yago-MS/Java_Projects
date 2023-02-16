package act_res213;

import java.util.Scanner;

public class Act_res213 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec, min, hor, secAña;

        System.out.println("introduzca la hora");
        hor = sc.nextInt();
        System.out.println("Introduzca los minutos");
        min = sc.nextInt();
        System.out.println("Introduzca los segundos");
        sec = sc.nextInt();
        System.out.println("cuantos segundos pasan?");
        secAña = sc.nextInt();

        sec = sec + secAña;

        if (sec > 59) {
            min = min + sec / 60;
            sec = sec % 60;
            if (min > 59) {
                hor = hor + min / 60;
                min = min % 60;
                hor = hor % 24;
            }
        }
        System.out.println("hora + " + secAña + " sec es: " + hor + ":" + min + ":" + sec);

    }

}
