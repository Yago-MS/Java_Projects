//por YAGO
package act_aplic412;

import java.util.Scanner;


public class Act_Aplic412 {
    public static double distancia(double x1, double x2, double y1, double y2){
    double distancia = Math.sqrt(Math.pow((x1-x2), 2)+ Math.pow((y1-y2), 2));
    return distancia;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x1=2, x2=3, y1=4, y2=5;
       
        System.out.println("siendo; x1, x2, y1, y2: 2,3,4,5 respectivamente...");
        System.out.println(distancia(x1, x2, y1, y2));
    }

}
