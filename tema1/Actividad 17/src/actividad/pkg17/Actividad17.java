
package actividad.pkg17;

import java.math.*;
import java.util.Scanner;

public class Actividad17 {


    public static void main(String[] args) {
      
        double radio;
        double longitud, área;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el radio");
        radio = sc.nextDouble();
        
        longitud = (2 * Math.PI) * radio;
        System.out.println("La longitud es " + longitud);
        área = Math.PI * (radio * radio);
        System.out.println("El área es " + área);
        
        
    }
    
}
