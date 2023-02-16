
package act_aplic113;
import java.util.Scanner;
public class Act_aplic113 {

  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Inserte numero:");   
        int numero = sc.nextInt();
        System.out.println("Inserte el numero a ser multiplo:");
        int multi = sc.nextInt();
        int resto = numero % multi;
        resto = 0 == resto ? multi : resto;
        int suma = multi - resto;
        int numeroMul = numero + suma;
        
        System.out.println("habria que sumarle:" + suma);
        System.out.println("el resultado final es:" + numeroMul); 
    }
    
}
