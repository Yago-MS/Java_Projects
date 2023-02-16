
package act_aplic115;

import java.util.Scanner;


public class Act_aplic115 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("valor de a:");
            double a = sc.nextDouble();
        System.out.println("valor de b:");
            double b = sc.nextDouble();
        System.out.println("valor de c:");
            double c = sc.nextDouble();
        System.out.println("valor de x:");
            double x = sc.nextDouble();
        
           
            
           System.out.println("El valor de Y es:" + (a * (x * x) + (b * x) + c)); 
            
            
            
    }
    
}
