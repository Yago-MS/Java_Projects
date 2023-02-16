package act_aplic117;

import java.util.Scanner;

public class Act_aplic117 {


    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        double centi1, centi2, centiFinal;
     
        System.out.println("inserte medida en milimetros");
            double mili = sc.nextDouble();
        System.out.println("inserte medida en centimetros");
            double centi = sc.nextDouble();
        System.out.println("inserte medida en metros");
            double metro = sc.nextDouble();
            
           centi1 = mili/10;
           centi2 = metro * 100;
           
           centiFinal = centi + centi1 + centi2;
           
           System.out.print("el total es: " + centiFinal + "cm");
            
    }
    
}
