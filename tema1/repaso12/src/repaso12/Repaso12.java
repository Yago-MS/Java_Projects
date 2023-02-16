package repaso12;

import java.util.Scanner;


public class Repaso12 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double mediaDes,nota1,nota2;
      
        System.out.println("inserte la primera nota:");
        nota1 = sc.nextDouble();
        System.out.println("inserte la media deseada:");
        mediaDes = sc.nextDouble();
        
        nota2 = (mediaDes - nota1*0.4) / 0.60;
        
        System.out.println("la nota que debes sacar para esa madia es: "+ nota2);
    }
    
}
