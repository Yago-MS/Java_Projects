
package repaso.extra;

import java.util.Scanner;


public class RepasoExtra {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int altura;
       
        System.out.println("inserte la altura");
        altura = sc.nextInt();
        
        for (int fila=1;fila<altura;fila++){
            System.out.println("");
            for (int aux=altura; aux<=altura;aux--){
                System.out.print("* ");
            }
        }
            
    }

}
