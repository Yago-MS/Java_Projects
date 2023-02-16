
package actividad.resulta.pkg1.pkg6;

import java.util.Scanner;

public class ActividadResulta16 {


    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la primera nota");
   int nota1 = sc.nextInt();
        System.out.println("Inserte la segunda nota");
   int nota2 = sc.nextInt();
   double nota3 = (nota1 + nota2) /2.0;
   
        System.out.println("La media es:" + nota3);
        
    }
    
}
