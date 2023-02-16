package act_aplic120;

import java.util.*;
public class Act_aplic120 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Inserte el numero");
       int numero = sc.nextInt();
       
       double resultado = Math.sqrt(numero);
        
        System.out.println("La raíz cuadrada es: " + resultado);
    }
    
}
