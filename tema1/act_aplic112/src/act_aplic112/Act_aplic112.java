
package act_aplic112;
import java.util.Scanner;
public class Act_aplic112 {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Inserte numero:");   
        int numero = sc.nextInt();
        int resto = numero % 7;
        resto = 0 == resto ? 7 : resto;
        int suma = 7 - resto;
        int numeroMul = numero + suma;
        
        System.out.println("habria que sumarle:" + suma);
        System.out.println("el resultado final es:" + numeroMul);
        
    }
    
}
