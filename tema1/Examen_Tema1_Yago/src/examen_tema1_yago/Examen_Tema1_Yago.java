package examen_tema1_yago;

import java.util.Scanner;

public class Examen_Tema1_Yago {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        double division;
        int nuMuestra1, nuMuestra2;
        System.out.print("Introduzca el primer numero:");
        numero1 = sc.nextInt();

        System.out.print("Introduzca el segundo numero:");
        numero2 = sc.nextInt();
        
        nuMuestra1 = numero1 > numero2 ? numero1 : numero2;
        nuMuestra2 = numero1 < numero2 ? numero1 : numero2;
        
        division = numero1 > numero2 ? numero1 % numero2 : numero2 % numero1;  

        boolean divisible = division == 0;

        System.out.printf("El %d es divisible por %d? " + divisible, nuMuestra1, nuMuestra2);

    }

}
