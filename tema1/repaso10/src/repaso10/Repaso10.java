
package repaso10;

import java.util.Scanner;

public class Repaso10 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Mb, Kb;
        
        System.out.println("inserte los Mb");
        Mb = sc.nextDouble();
        
        Kb = Mb * 1024.0;
        
        System.out.printf("son %f Kb",Kb);
        
                
                
    }
    
}
