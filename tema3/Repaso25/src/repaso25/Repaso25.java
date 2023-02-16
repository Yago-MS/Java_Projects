
package repaso25;

import java.util.Scanner;


public class Repaso25 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num, numVuel=0, aux;
       
       do {
           System.out.println("Inserte un numero");
           num = sc.nextInt();
       }while(num<0);
       
       while (num>0){
       aux = num%10;
       numVuel = numVuel*10 + aux;
       num = num/10;
       }
        System.out.println(numVuel);
               
    }

}
