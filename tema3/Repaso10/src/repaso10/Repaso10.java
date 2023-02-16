
package repaso10;

import java.util.Scanner;


public class Repaso10 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double num, med=0, cont=0;
       
        do{
            System.out.println("Inserte un numero");
            num = sc.nextInt();
            if(num>0){
            med = med + num;
            cont++;
            }
        }while(num>0);
       
        System.out.println("la media es " + (med/cont));
       
    }

}
