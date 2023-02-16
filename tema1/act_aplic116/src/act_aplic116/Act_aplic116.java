
package act_aplic116;

import java.util.Scanner;


public class Act_aplic116 {

   
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int numSeg, h, m, s;
        
        System.out.println("inserte el numero de segundos:");
            numSeg = sc.nextInt();
        h = numSeg/3600;
        m = numSeg/60- (h*60);
        s = numSeg - (h*3600+m*60);
        
        System.out.println("las horas son:" + h);
        System.out.println("los minutos son:" + m);
        System.out.println("los segundos son:" + s);
        
        
        
        
        
        
    }
    
    
    
    
}
