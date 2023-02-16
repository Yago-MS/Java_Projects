
package repaso32;

import java.util.Scanner;


public class Repaso32 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        long num, suma=0, digVuel, numVuel=0;
       
       do {
           System.out.println("inserte un número: ");
          num = sc.nextInt();
       }while(num<=0);
       
        
        
        while (num>0){
       digVuel = num%10;
       numVuel = numVuel*10 + digVuel;
       num = num/10;
       }
        System.out.println("pares:");
        while (numVuel>0){
            digVuel = numVuel%10;
            if (digVuel%2 == 0){
                System.out.print(digVuel + " ");
                suma = suma + digVuel;
            }
      numVuel = numVuel/10;
       }
        System.out.println("");
        System.out.println("La suma de los pares es: " + suma);
    }

}
