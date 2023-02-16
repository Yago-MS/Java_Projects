//por YAGO
package act_res49;

import java.util.Scanner;

public class Act_Res49 {

    public static int max(int num1, int num2) {
        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    public static int max(int num1, int num2, int num3) {
        int max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, elec;

        do {
            System.out.println("maximo de 2 o de 3 numeros? (1,2)");
            elec = sc.nextInt();
        } while (elec > 2 || elec < 1);
        switch (elec) {
            case 1 -> {
                System.out.println("Inserte el primer numero:");
                num1 = sc.nextInt();
                System.out.println("Inserte el segundo número:");
                num2 = sc.nextInt();
                int max = max(num1, num2);
                System.out.println("El numero mayor es:" + max);
            }
            case 2 -> {
                System.out.println("Inserte el primer numero:");
                num1 = sc.nextInt();
                System.out.println("Inserte el segundo número:");
                num2 = sc.nextInt();
                System.out.println("Ingrese el tercer numero:");
                num3 = sc.nextInt();
                int max = max(num1, num2, num3);
                System.out.println("El numero mayor es:" + max);}
        }
    }
}

    
