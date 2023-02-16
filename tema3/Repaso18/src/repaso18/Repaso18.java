package repaso18;

import java.util.Scanner;

public class Repaso18 {

    public static void main(String[] args) {
        int aux, min, max;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca el primer número: ");
            min = sc.nextInt();
            System.out.println("Introduzca el segundo número ");
            max = sc.nextInt();
        } while (min == max);
        
        aux = min < max ? min : max;
        max = max > min ? max : min;
        min = aux;
        for (int num = min; num <= max; num = num + 7) {
            System.out.println(num);
        }
    }

}
