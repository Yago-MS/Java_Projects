
package repaso9;

import java.util.Scanner;
public class Repaso9 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio,altura,volumen;
        
        System.out.println("Inserte la altura del cono");
        altura = sc.nextDouble();
        
        System.out.println("Inserte el radio del cono");
        radio = sc.nextDouble();
        
        
        volumen = (Math.PI * (radio * radio) * altura) / 3;
        
        System.out.printf("El volumen de tu cono es: %.3f",volumen);
    }
    
}
