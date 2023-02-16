
package actividad112;

import java.util.Scanner;


public class Actividad112 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         int numero;
        int numeroAbsoluto;
        System.out.println("inserte su numero");
        numero = sc.nextInt();
        
        numeroAbsoluto = numero > 0 ? numero : numero * (-1);
        
        System.out.println(numeroAbsoluto);
       
    }
    
}
