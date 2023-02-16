
package actresuelta4_6;

import java.util.Scanner;

public class ActResuelta4_6 {
  public static boolean identificadorPrimo(int num){
    boolean y=true;
    for(int i=2; num/2>=i;i++){
        if(num%i==0){
            y=false;
        }
    }
      return y;
  }

  public static void main(String[] args) {
      int num;
      boolean primo;
      Scanner sc = new Scanner (System.in);
      
      System.out.println("Escribe un numero: ");
      num=sc.nextInt();
      primo=identificadorPrimo(num);
      
      if(primo==true){
          System.out.println("El numero es primo");
      }else{System.out.println("El numero no es primo");}
        
    }

}
