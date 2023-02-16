
package actresuelta4_5;

import java.util.Scanner;


public class ActResuelta4_5 {
  public static boolean identificadorVocales(char vocal){
      boolean i=false;
      if(vocal=='a'||vocal=='e'||vocal=='i'||vocal=='o'||vocal=='u'){
          i=true;
      }
      return i;
  }

  public static void main(String[] args) {
      char letra;
      boolean vocal;
      Scanner sc = new Scanner (System.in);
      
      System.out.println("Escribe una letra: ");
      letra=sc.nextLine().charAt(0);
      
      vocal=identificadorVocales(letra);
      
      if (vocal==true){
          System.out.println("La letra es una vocal.");
      }else{
          System.out.println("No es una vocal");
      }
    }

}
