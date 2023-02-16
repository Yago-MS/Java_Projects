package act_aplic314;

import java.util.Scanner;

public class Act_Aplic314 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, aux, cont = 1, nump = 0;
        boolean primo;

        System.out.println("inserte un numero");
        num = aux = sc.nextInt();

        num--;

        for (; cont <= num; cont++) {
            primo = true;

            for (int divisor = 2; divisor <= cont/2; divisor++) {
                if (cont % divisor == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(cont);
                nump++;
            }

        }
        System.out.println("el numero total de primos es:" + nump);
    }

}
