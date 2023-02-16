//por YAGO
package repaso_35;

import java.util.Scanner;
import static repaso_35.Biblioteca.voltea;


public class Repaso_35 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num; 
       System.out.println("inserte un numero");
       num = sc.nextInt();
       
       num = voltea(num);
       
       for (int numAux=num, digP;numAux>0;numAux/=10){
       digP=numAux%10;
       
       
           while (digP > 0) {
               System.out.print("|");
               if (numAux > 10) {
                   System.out.print("-");
               }
               digP--;
           }

     
       }

    }

}
