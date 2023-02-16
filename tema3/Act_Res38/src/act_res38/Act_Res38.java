
package act_res38;

import java.util.Scanner;

public class Act_Res38 {


    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        int cont = 1, med=0;
        
        
        for (int num; cont <=10;cont++){
        
            System.out.println("Inserte un numero:");
            num = sc.nextInt();
            med = med + num;
        }
        System.out.println("La media es: " + med/10.0);
    }
    
}
