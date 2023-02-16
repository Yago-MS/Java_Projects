
package repaso47;

import java.util.Scanner;


public class Repaso47 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int alt;
        do{
            System.out.println("Inserte la altura del 8 (debe ser mayor de 5 e impar)");
            alt = sc.nextInt();
        }while (alt<5 || alt%2==0);
        
        for (int ref=1;ref<=alt;ref++){
            if (ref==1||ref==alt/2+1||ref==alt){
                System.out.println("MMMMMM");
            }else {
                System.out.println("M    M");
            }
        
        }
        
    }

}
