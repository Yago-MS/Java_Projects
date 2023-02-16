
package repaso11;

import java.util.Scanner;


public class Repaso11 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Mb, Kb;
        
        System.out.println("inserte los Kb");
        Kb = sc.nextDouble();
        
        Mb = Kb / 1024.0;
        
        System.out.printf("son %f Mb",Mb);
    }
    
}
