package act_aplic114;
import java.util.Scanner;

public class Act_aplic114 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double area;
        System.out.println("inserte la base:");
        double base = sc.nextDouble();
        System.out.println("inserte la altura:");
        double altura = sc.nextDouble();
        
        area = (base * altura) /2.0;
        
        System.out.println("El área del triangulo es:" + area);
        
    }
    
}
