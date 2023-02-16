
package actividad113;

import java.util.Scanner;


public class Actividad113 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3;
        double media;
        int mediaTrunc;
        System.out.println("primera nota:");
        nota1 = sc.nextInt();
        System.out.println("segunda nota:");
        nota2 = sc.nextInt();
        System.out.println("Tercera nota:");
        nota3 = sc.nextInt();
        
        media = (nota1 + nota2 + nota3) / 3.0;
        
        mediaTrunc = (int)media;
        
        System.out.println("La media con decimales es:" + media);
        System.out.println("La media sin decimales es:" + mediaTrunc);
    }
    
}
