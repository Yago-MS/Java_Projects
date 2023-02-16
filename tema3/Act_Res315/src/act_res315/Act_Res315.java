package act_res315;

import java.util.Scanner;

public class Act_Res315 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("inserte el número");
        int num = sc.nextInt();
        int fila = 0;
        for (; num > 0; num--) {

            for (fila = 0; fila < num; fila++) {
                System.out.print("☻ ");

            }
            System.out.println();
        }
    }

}
