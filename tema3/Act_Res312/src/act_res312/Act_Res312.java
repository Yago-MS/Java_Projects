package act_res312;

import java.util.Scanner;

public class Act_Res312 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, cont = 5;
        boolean suspenso = false;

        do {
            System.out.println("Inserte la nota del alumno");
            nota = sc.nextInt();
            if (nota < 5) {
                suspenso = true;
            }

            cont--;

        } while (cont > 0);
        if (suspenso) {
            System.out.println("hay un suspenso");
        } else {
            System.out.println("Todos están aprobados");
        }
    }

}
