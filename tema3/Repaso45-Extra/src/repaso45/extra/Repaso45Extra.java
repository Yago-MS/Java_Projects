//por YAGO
package repaso45.extra;

import java.util.Scanner;

public class Repaso45Extra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux, num, numC, dig, contDig = 0, cont = -1;
        
        do {
            System.out.println("Inserte un numero:");
        aux = num = sc.nextInt();
        }while(num<0);
       
        while (aux > 0) {
            aux /= 10;
            cont++;
        }
        aux = num;
       do { 
           System.out.println("Inserte la posición del digito a cambiar:");
        dig = sc.nextInt();
       }while (dig<0||dig>cont);
       dig--;
        
       do {
          System.out.println("Inserte por que numero se va a sustituir:");
        numC = sc.nextInt();
       }while (numC<0||numC>9);
        
        
        cont = cont - dig;
        for (; cont > 0; cont--) {
            aux = aux / 10;
            contDig++;
        }
        
        dig = aux % 10;
        dig = dig * ((int) Math.pow(10, contDig));
        numC = numC * ((int) Math.pow(10, contDig));
        
        num= num - dig;
        num = num + numC;
        System.out.println("el numero final es:" + num);
    }

}
