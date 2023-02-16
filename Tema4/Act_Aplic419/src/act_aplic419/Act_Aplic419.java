//por YAGO
package act_aplic419;

import java.util.Scanner;
import static repaso1_14.Biblioteca.esCapicua;

public class Act_Aplic419 {

    public static void rand(int num, int min, int max) {
        max = (max - min) + 1;
        for (int cont = 0; cont < num; cont++) {
            System.out.println((int) (Math.random() * max) + min);
        }

    }
    public static void rand(int num){
    
        for (int cont = 0; cont < num; cont++) {
            System.out.println(Math.random());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 10, min = 20, max = 44, elec;
        
        do{
            System.out.println("¿mostrar maximo y minimo? (1 si, 2 no)");
            elec = sc.nextInt();
        }while (elec<1||elec>2);
        
        if (elec == 1) {
        System.out.println("suponiendo que el numero es 10, el minimo es 20 y el maximo es 44");
        rand(num, min, max);}
        else {
            System.out.println("suponiendo que el numero 10");
            rand(num);
        }
        System.out.println(esCapicua(num));
    }
}
