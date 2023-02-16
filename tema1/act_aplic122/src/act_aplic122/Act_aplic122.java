
package act_aplic122;

import java.util.Scanner;


public class Act_aplic122 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Cuantos metros ha alcanzado?");
            double metros = sc.nextDouble();
        
        double centimetrosDec = metros * 100;
        int centimetros = (int) centimetrosDec;
        
        System.out.println("La cantidad total es: " + centimetros + "cm");
        
        
        
    }
    
}
