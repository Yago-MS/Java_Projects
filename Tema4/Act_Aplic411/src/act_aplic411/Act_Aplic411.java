//por YAGO
package act_aplic411;

import java.util.Scanner;


public class Act_Aplic411 {

    public static double superficie(double radio){
    double superficie = (4*Math.PI)*Math.pow(radio, 2);
    return superficie;
    }
    public static double volumen(double radio){
    double volumen = ((4*Math.PI)/3)*(Math.pow(radio, 3));
    return volumen;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double radio;
        System.out.println("Inserte el radio de la esfera");
        radio = sc.nextDouble();
        
        System.out.println("La superficie es: " + superficie(radio));
        System.out.println("El volumen es: " + volumen(radio));
       
       
    }

}
