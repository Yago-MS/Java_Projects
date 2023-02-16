
package act_aplic318;

import java.util.Scanner;


public class Act_aplic318 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int a, b;
       
        System.out.println("inserte el numero a:");
        a = sc.nextInt();
        System.out.println("inserte el numero b:");
        b = sc.nextInt();
        
        for (int h=Math.max(a, b);h<=(a*b);h++){
        if(h%a==0&&h%b==0){
            System.out.println("al minimo común multiplo es: " + h);
            h=a*b;
        }
        
        }
        
    }

}
