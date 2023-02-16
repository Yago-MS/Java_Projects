package act_prop31;

import java.util.Scanner;


public class Act_Prop31 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       int edad, edadMin, edadMax;
       
       System.out.println("Introduzca la edad de alumno");
           edad=edadMin=edadMax=sc.nextInt();
       while (edad != -1) {
           
           System.out.println("introduzca la edad del alumno");
           edad = sc.nextInt();
            
           edadMin = edad < edadMin && edad != -1? edad : edadMin; 
           edadMax = edad < edadMax ? edadMax : edad;
            
       }
        
        System.out.println("La edad minima es:" + edadMin);
        System.out.println("La edad máxima es:" + edadMax);
    }
    
}
