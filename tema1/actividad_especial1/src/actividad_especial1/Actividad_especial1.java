package actividad_especial1;

import java.util.Scanner;

public class Actividad_especial1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.print("Inserte la nota:");
        nota = sc.nextDouble();

        if (nota < 5 && nota >= 0) {
            System.out.println("Insuficiente");
        } else {
            if (nota >= 5 && nota < 6) {
                System.out.println("Suficiente");
            } else {
                if (nota >= 6 && nota < 7) {
                    System.out.println("Bien");
                } else {
                    if (nota >= 7 && nota < 9) {
                        System.out.println("Notable");
                    } else {
                        if (nota >= 9 && nota < 10) {
                            System.out.println("Sobresaliente");
                        } else {
                            if (nota == 10) {
                                System.out.println("Matricula de honor");
                            } else {
                                System.out.println("No computa");
                            }
                        }
                    }
                }
            }
        }
    }
}
