package act_res210;

import java.util.Scanner;

public class Act_res210 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la nota:");
        int nota = sc.nextInt();

        switch (nota) {

            case 0, 1, 2, 3, 4 ->
                System.out.println("Insuficiente");
            case 5 ->
                System.out.println("Suficiente");
            case 6 ->
                System.out.println("bien");
            case 7, 8 ->
                System.out.println("notable");
            case 9 ->
                System.out.println("sobresaliente");
            case 10 ->
                System.out.println("matricula de honor");
            default ->
                System.out.println("no computa");
        }
    }

}
