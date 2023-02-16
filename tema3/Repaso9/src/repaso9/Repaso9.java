package repaso9;

import java.util.Scanner;

public class Repaso9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont = 1;
        System.out.println("Introduzca el numero");
        num = sc.nextInt();

      
        while (num > 9) {
            num = num / 10;
            cont++;
        }
      
        System.out.println("los dijitos del numero son: " + cont);
        }
    }


