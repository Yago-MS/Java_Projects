
package act_aplic121;

import java.util.Scanner;


public class Act_aplic121 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("inserte el primer numero:");
            double a = sc.nextDouble();
        System.out.println("inserte el segundo numero:");
            double b = sc.nextDouble();
            
            boolean igualdad = a == b;
            
            System.out.println("los numeros son iguales? " + igualdad);
    }
    
}
