
package actividad111;

import java.util.Scanner;
public class Actividad111 {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double manSemestre1, manSemestre2;
   double perSemestre1, perSemestre2;
   final double Kilo_Manzanas = 2.35;
   final double Kilo_Peras = 1.95;
   double gananciasMan, gananciasPer;
   double gananciasTotal;
   System.out.println
        ("¿kilos de manzanas vendidos en el primer semestre?");
   manSemestre1 = sc.nextDouble();
      System.out.println
        ("¿kilos de manzanas vendidos en el segundo semestre?");
        manSemestre2 = sc.nextDouble(); 
        
       System.out.println
        ("¿Kilos de peras vendidos en el primer semestre?");
        perSemestre1 = sc.nextDouble();
       System.out.println
        ("¿Kilos de peras vendidos en el segundo semestre?");
        perSemestre2 = sc.nextDouble();   
         
    gananciasMan = (manSemestre1 * Kilo_Manzanas) + (manSemestre2 * Kilo_Manzanas);
    gananciasPer = (perSemestre1 * Kilo_Peras) + (perSemestre2 * Kilo_Peras);
   
        gananciasTotal = gananciasMan + gananciasPer;
        
        System.out.println
        ("Las ganacias este año son:" + gananciasTotal);
         
         
         
        
        
        
    }
    
}
