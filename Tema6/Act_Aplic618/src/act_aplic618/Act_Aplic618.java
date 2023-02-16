//por YAGO
package act_aplic618;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;


public class Act_Aplic618 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la frase a cambiar");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();
        String [] cammel = frase.split(" ");
        for (int i = 0; i < cammel.length; i++) {

           cammel[i].charAt(0);
           
        }
        for (int i = 0; i < cammel.length; i++) {
            System.out.print(cammel[i]);
            
        }
            
    }

}
