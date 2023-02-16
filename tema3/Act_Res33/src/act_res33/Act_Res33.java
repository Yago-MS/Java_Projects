package act_res33;

import java.util.Scanner;

public class Act_Res33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, resp, cont = 0;
        num = (int) (Math.random() * 100 + 1);
        System.out.println("adivina el numero!");
        resp = sc.nextInt();
        while (resp > 0 && cont != 4 && resp != num) {
            if (num < resp) {
                System.out.println("prueba menos");
            } else {
                System.out.println("prueba mas");
            }
            System.out.println("Intentalo de nuevo:");
            resp = sc.nextInt();
            cont++;

        }
        if (num == resp) {
            System.out.println("Correcto!");
        } else {
            System.out.println("mas suerte la proxima");
        }
    }

}
