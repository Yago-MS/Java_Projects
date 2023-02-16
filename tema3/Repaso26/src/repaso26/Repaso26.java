
package repaso26;

import java.util.Scanner;


public class Repaso26 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num, dig, digVuel, numVuel=0, cont=0, aux;
       
       do {
           System.out.println("inserte un número: ");
          aux = num = sc.nextInt();
       }while(num<=0);
       
        System.out.println("Inserte un digito:");
        dig = sc.nextInt();
        
        while (num>0){
       digVuel = num%10;
       numVuel = numVuel*10 + digVuel;
       num = num/10;
       }
        while (numVuel>0){
       cont++;
            digVuel = numVuel%10;
            if (digVuel==dig){
                System.out.println("el número " + dig + " coincide en la posición " + cont);
            }
      numVuel = numVuel/10;
       }
    }

}
