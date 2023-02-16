//por YAGO
package repaso_37;

import java.util.Scanner;
import static repaso_37.Biblioteca.digitos;
import static repaso_37.Biblioteca.voltea;


public class Repaso_37 {

    
     
   
   public static String conversorMorse(){
      int num,cifra;
      String simbol = " ";
      
      Scanner myVar = new Scanner (System.in);
      
      do{
          System.out.println("Escribe un numero positivo: ");
          num=myVar.nextInt();
      }while(num<0);
      
      num=voltea(num);
      
        
       for(int y=digitos(num);y>0;y--){
           cifra=num%10;
           num/=10;
           
       switch (cifra){
          case 1-> {System.out.print(". _ _ _ _");}
          case 2-> {System.out.print(". . _ _ _");}
          case 3-> {System.out.print(". . . _ _");}
          case 4-> {System.out.print(". . . . _");}
          case 5-> {System.out.print(". . . . .");}
          case 6-> {System.out.print(". _ _ _ .");}
          case 7-> {System.out.print(". _ _ _. .");}
          case 8-> {System.out.print(". _ _ . . .");}
          case 9-> {System.out.print(". _ . . . .");}
          case 0-> {System.out.print(". . . . . .");}
           
       }
           
       }
      
      return simbol;
       
   }

  public static void main(String[] args) {
      System.out.println(conversorMorse());
        
    }

}