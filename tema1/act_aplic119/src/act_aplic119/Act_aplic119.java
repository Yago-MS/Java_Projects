
package act_aplic119;

import java.util.Scanner;


public class Act_aplic119 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
          
        int entradaAdul, entradaInf;      
        final double precio_adul, precio_inf;
        double precioTotal, precioDescuento;
         precio_adul = 20;
         precio_inf = 15.50;
      
        System.out.println("Cuantas entradas de adulto?");
            entradaAdul = sc.nextInt();
        System.out.println("Cuantas entradas infantiles?");    
            entradaInf = sc.nextInt();
            
            precioTotal = (entradaAdul * precio_adul) + (entradaInf * precio_inf);
            
            precioDescuento = precioTotal - ((precioTotal* 5) /100);
            
             precioTotal = precioTotal >= 100 ? precioDescuento : precioTotal;
            
            System.out.println("El precio total es:" + precioTotal);
    }
    
}
