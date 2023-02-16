package act_res11;

import java.util.Scanner;


public class Act_Res11 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int total=1, num;
        System.out.println("inserte un número:");
        num = sc.nextInt();
        while(num>0){
        
        total = total * num;
        num--;
        }
        System.out.println(total);
    }

}
