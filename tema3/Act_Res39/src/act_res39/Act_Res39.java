package act_res39;

import java.util.Scanner;


public class Act_Res39 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int num, multi=1;
        System.out.println("inserte un numero:");
        num = sc.nextInt();
      if (num>0 && num<= 10){ 
          
          for (;multi <=10;multi++){
          
              System.out.println(num + " por " + multi + " es: " + (num*multi));
          }
       
       } else {
        System.out.println("inserte un numero válido");
      }
      
    }
    
}
