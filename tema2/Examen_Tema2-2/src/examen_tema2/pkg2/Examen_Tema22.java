package examen_tema2.pkg2;

import java.util.Scanner;

public class Examen_Tema22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, invertido = 0, suma=0, cont= 0;
        System.out.println("Introduzca el numero:");
        num1 = sc.nextInt();

        while (num1 > 0) {
            num2 = num1 % 10;
            if (num2 == 1){
            num2 = num2 + 1;
            }
            invertido = invertido * 10 + ((int)Math.pow(num2, suma));
            num1 = num1 / 10;
            suma++;
        }
        System.out.println(invertido);
    }
}

