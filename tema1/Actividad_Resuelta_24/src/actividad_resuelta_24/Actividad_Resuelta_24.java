
package actividad_resuelta_24;

import java.util.Scanner;


public class Actividad_Resuelta_24 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double numero;
        System.out.print("inserte el numero:");
        numero = sc.nextDouble();
        if (numero >= -1 || numero <= 1 || numero== 0){
            System.out.println("no es un casi cero");
        } else {
            System.out.println("es un casi cero");
        }
        
        
        
    }
    
}
