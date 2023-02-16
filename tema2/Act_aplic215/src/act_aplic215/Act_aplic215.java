package act_aplic215;

import java.util.Scanner;

public class Act_aplic215 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double base, altura, resultado;
        
        System.out.println("Inserte la base");
        base = sc.nextDouble();
        System.out.println("Inserte la altura");
        altura = sc.nextDouble();
        resultado = base * altura /2.0;
        
        if (resultado > 0) {
            System.out.println("el área es: " + resultado);
        } else {
            System.out.println("Inserte datos validos");
        }
        
        
    }
    
}
