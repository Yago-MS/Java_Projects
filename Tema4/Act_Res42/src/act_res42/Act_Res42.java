//por YAGO
package act_res42;

import java.util.Scanner;


public class Act_Res42 {

    static void muestra(int a, int b){
        int mayor = Math.max(a, b);
        int menor = Math.min(a, b);
        for (int num=menor;num<mayor;num++)
            System.out.print(" " + num);
                    
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num1, num2;
        System.out.println("inserte un numero");
        num1 = sc.nextInt();
        System.out.println("inserte otro numero");
        num2 = sc.nextInt();
       muestra(num1,num2);
    }

}
