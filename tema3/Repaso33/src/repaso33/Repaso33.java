package repaso33;

import java.util.Scanner;

public class Repaso33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alt;

        System.out.println("Inserte la altura de la U:");
        alt = sc.nextInt();
        for (int fila = 1; fila <= alt; fila++) {
            for (int col = 1; col <= alt; col++) {
                if (fila != alt) {
                    if ((col == 1) || (col == alt))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                } else {
                    if ((col == 1) || (col == alt))
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                }
                
            }
            System.out.println("");
        }

    }
}
