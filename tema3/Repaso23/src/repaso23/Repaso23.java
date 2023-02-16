package repaso23;

import java.util.Scanner;

public class Repaso23 {

    public static void main(String[] args) {
        double num, numSuma = 0, media, cont = 0;

        Scanner sc = new Scanner(System.in);

        while (numSuma <= 10000) {
            System.out.println("Introduzca un numero: ");
            num = sc.nextInt();
            numSuma += num;
            cont++;
        }

        media = numSuma / cont;

        System.out.println("La suma de todos los valores es: " + numSuma);
        System.out.println("La media de los valores introducidos es: " + media);
    }

}
