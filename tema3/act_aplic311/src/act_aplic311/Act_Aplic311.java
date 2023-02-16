package act_aplic311;

import java.util.Scanner;


public class Act_Aplic311 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long numD, numB=0, cont=0, cifraB=0;
      
        System.out.println("Introduzca el numero");
         numD = sc.nextLong();
         
         while (numD!=0){
         cifraB=numD%2;
         numB= (long) (numB + cifraB * Math.pow(10, cont));
         cont++;
         numD=numD/2;
         }
         
         System.out.println(numB);
    }
    
}
