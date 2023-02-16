package act_res29;

import java.util.Scanner;


public class Act_res29 {

public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("escribe un numero entre 0 y 99.999: ");
        num = sc.nextInt();
        
        if (num>99999 || num<0){
            System.out.println("no computa, reinicia");
        }
        else if (num<10){
            System.out.println("tiene 1 cifra");
        }
        else if (num<100){
            System.out.println("tiene 2 cifras");
        }
        else if (num<1000){
            System.out.println("tiene 3 cifras");
        }
        else if (num<10000){
            System.out.println("tiene 4 cifras");
        }
        else if (num<100000){
            System.out.println("tiene 5 cifras");
        }
    }
    
}