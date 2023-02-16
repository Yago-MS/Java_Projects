package repaso7;

import java.util.Scanner;

public class Repaso7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod, intento = 0;

        cod = (int) (Math.random() * 9000 + 1000);
        System.out.println(cod);

        for (int cont = 1;cont <= 4&&intento!=cod; cont++) {
            System.out.println("introduzca el codigo");
            intento = sc.nextInt();
        }
        if (cod == intento) {
            System.out.println("acceso permitido");
        } else {
            System.out.println("demsiados intentos...");
        }
    }

}
