
package repaso24;

import java.util.Scanner;


public class Repaso24 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int filas;
        do {
            System.out.println("Inserte el numero de filas: ");
            filas = sc.nextInt();
        }while (filas <=0);
        
        for(int cont=1;filas>=cont;cont++){
            
            for(int esp=filas-cont;esp !=0;esp--){
                System.out.print(" ");
            }
            
            
            for (int ast=cont-1;ast!=0;ast--){
                
               System.out.print((ast+2)%10);
            }
            for (int ast=2;ast<cont;ast++){
                 
               System.out.print((ast+2)%10);
               
            }
            System.out.println("");
        }
            
        
    }

}
