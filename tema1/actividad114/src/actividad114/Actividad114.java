
package actividad114;

import java.util.Scanner;


public class Actividad114 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        int numeroRedondeado;
            System.out.println("Inserte el numero");
        numero = sc.nextDouble();
        
        numeroRedondeado = (int)(numero + 0.5);
            System.out.println(numeroRedondeado);
        
        
        
    }
    
}
