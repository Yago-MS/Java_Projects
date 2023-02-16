
package act_aplic111;

import java.util.Scanner;


public class Act_aplic111 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        final int iva;
        double base, precioFinal, importeIva;
        
        
        System.out.println("Inserte la base imponible");
        base = sc.nextDouble();
        System.out.println("Inserte el iva a aplicar");
        iva = sc.nextInt();
        
        importeIva = (base * iva) /100;
        
        precioFinal = base + importeIva;
        
        System.out.println("el importe de iva es: " + importeIva);
        System.out.println("el importe total es: " + precioFinal);
        
    }
    
}
