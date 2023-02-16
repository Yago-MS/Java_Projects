//por YAGO
package repaso49;

import java.util.Scanner;

public class Repaso49 {

    public static void main(String[] args) {
        int num, cont = 0, max= Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        double x;
        boolean primo;
        Scanner sc = new Scanner(System.in);

        do {
            primo = true;
            System.out.println("escribe un numero:");
            num = sc.nextInt();

            for (int comprobador = 2; comprobador <= (int) num / 2; comprobador++) {
                x = num % comprobador;

                if (x == 0) {
                    primo = false;
                }
            }
            if (!primo){
            max = num > max ? num : max;
            min = num < min ? num : min;
            cont++;
            sum += num;}
        } while (primo == false);


        if (cont == 0) {
            System.out.println("no se ha introducido ningun número");
        } else {
            System.out.println("Has introducido " + cont + " numeros no primos");
            System.out.println("El valor max es: " + max);
            System.out.println("El valor min es: " + min);
            x = sum / cont;
            System.out.println("La media es: " + x);
        }

    }

}
