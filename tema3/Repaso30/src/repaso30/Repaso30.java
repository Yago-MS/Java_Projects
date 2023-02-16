package repaso30;

import java.util.Scanner;

public class Repaso30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia1, dia2, hora1, hora2, horasTotal;

        do {
            System.out.println("Introduzca el primer dia (1 al 6): ");
            dia1 = sc.nextInt();
            System.out.println("Inreoduzca el segundo dia ([primer dia] al 7)");
            dia2 = sc.nextInt();
            System.out.println("Introduzca la hora del primer dia (formato 24H)");
            hora1 = sc.nextInt();
            System.out.println("Introduzca la hora del segundo dia (formato 24H)");
            hora2 = sc.nextInt();
        } while (dia1 <= 0 || dia1 > 6 || dia2 <= dia1 || dia2 > 7 || hora1 < 0 || hora2 < 0);

        horasTotal = 24 * (dia2 - dia1) + (hora2 - hora1);

        System.out.println("las horas entre el dia 1 y el dia 2 son: " + horasTotal);

    }

}
