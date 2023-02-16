package act_prop303;

import java.util.Scanner;


public class Act_Prop303 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num, digito;
        System.out.println("Inserte el numero");
        num = sc.nextInt();
        
        while (num > 0){
        digito = num%10;
            System.out.println(digito);
            num = num/10;
        }
    }

}
