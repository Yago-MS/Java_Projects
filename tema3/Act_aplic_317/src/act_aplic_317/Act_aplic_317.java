
package act_aplic_317;

import java.util.Scanner;


public class Act_aplic_317 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a, b;
       
        System.out.println("inserte el numero a:");
        a = sc.nextInt();
        System.out.println("inserte el numero b:");
        b = sc.nextInt();
        
        for (int h=Math.min(a, b);h>0;h--){
        if(a%h==0&&b%h==0){
            System.out.println("al maximo comun divisor es " + h);
            h=0;
        }
        
        }
        
    }

}
