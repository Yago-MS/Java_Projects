
package actresuelta4_7;

import java.util.Scanner;


public class ActResuelta4_7 {
    
    static boolean esPrimo(int a){
       boolean res = true;
       for(int i = 2; i<=(a/2);i++){
           if(a%i == 0){
               res = false;
           }
       }
       return res;
   }

   static void divisoresPrimos(int a){
       int res = 0;
       for(int i = 1; i<= a; i++ ){
           if(a%i==0 && esPrimo(i)){
               res++;
               System.out.println(i);
           }
       }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Inserte un numero");
        num = sc.nextInt();
        divisoresPrimos(num);
    }

}
