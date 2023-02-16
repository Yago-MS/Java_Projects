
package act_aplic316;

import java.util.Scanner;


public class Act_Aplic316 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num, esp, ast=1;
       
        System.out.println("Escriba un numero:");
        num = sc.nextInt();
        esp=num-1;
        for(;num>0;num--){
        
        for(int e=1;e<=esp;e++){
            System.out.print(" ");
        }
        esp--;
        for(int a=1;a<=ast;a++){
            System.out.print("* ");
        }  
        ast++;
            System.out.println("");
        }
    }

}
