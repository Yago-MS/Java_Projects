
package acitvidad.pkg19;

import java.util.Scanner;
public class Acitvidad19 {

    public static void main(String[] args) {
        
        System.out.println("Escribe el numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        boolean bol = (numero % 2) == 0;
        
        System.out.println("El numero es par: " + bol);
        
        
        
    }
    
}
