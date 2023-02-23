//por YAGO
package act_aplic714;

import java.util.Scanner;


public class Act_aplic714 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aPagar, pagado;
        
        
        System.out.println("inserte dinero a pagar");
        aPagar = sc.nextDouble();
        System.out.println("Inserte lo que ha pagado");
        pagado = sc.nextDouble();
        
        Cambio cambio = new Cambio(aPagar, pagado);
        cambio.billtes();
        cambio.monedas();
       
    }

}
