package act_res33.mod;

import java.util.Scanner;

public class Act_res33Mod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, resp, cont = 0;
        num = (int) (Math.random() * 100 + 1);
        do {
            System.out.println("adivina el numero!");
            resp = sc.nextInt();
            cont++;
            if (num < resp) {
                System.out.println("prueba menos");
            } else if (cont < 5) {
                System.out.println("prueba mas");   
            }
            
        } while (resp > 0 && cont != 5 && resp != num);
        
        if (num == resp) {
            System.out.println("Correcto!");
        } else {
            System.out.println("mas suerte la proxima");
        }
    }

}
