//por YAGO
package act_res43;

import java.util.Scanner;


public class Act_Res43 {

static double area(double radio, double altura){

     return (2*Math.PI)*radio*(altura+radio);
}
static void volumen(double radio, double altura){

    double volumen = Math.PI * (radio*radio) * altura;
    System.out.println("El volumen es:" + volumen);
}

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double radio, altura;
       int opcion;
        System.out.println("inserte el radio del cilindro:");
        radio = sc.nextDouble();
        System.out.println("inserte la altura del cilindro:");
        altura = sc.nextDouble();
        
        do{
            System.out.println("calculamos el área, o el volumen? (1,2)");
            opcion = sc.nextInt();
        }while (opcion < 0||opcion>2);
        
        if(opcion==1){
            double ar = area(radio, altura);
            System.out.println(ar);
        } else {
        volumen(radio, altura);
        }
        
    }

}
