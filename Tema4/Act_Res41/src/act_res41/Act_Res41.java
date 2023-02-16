//por YAGO
package act_res41;

import java.util.Scanner;


public class Act_Res41 {

    static void eco(int n){
        for (int veces=n;n>0;n--)
        System.out.println("eco...");
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n;
        System.out.println("Inserte el numero de ecos:");
        n = sc.nextInt();
        
        eco(n);
    }

}
