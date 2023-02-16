
package act_aplic319;

import java.util.Scanner;


public class Act_Aplic319 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int result=0, num, raiz=1;
       
        System.out.println("Inserte su numero.");
        num = sc.nextInt();
        
        while(raiz*raiz<=num){
        raiz++;
        }
        raiz--;
        result=(int) Math.pow(raiz,2);
        System.out.println("la raíz es:" + raiz);
        System.out.println("el resto es:" + (num-result));
    }

}
