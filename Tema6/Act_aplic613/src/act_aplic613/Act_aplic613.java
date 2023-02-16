//por YAGO
package act_aplic613;

import java.util.Scanner;


public class Act_aplic613 {

    
    public static void main(String[] args) {
       int posInicio, posFinal;
       Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el codigo");
        String codigo = sc.nextLine();
        
        
        do{
        posInicio = codigo.indexOf("/*");
        posFinal = codigo.indexOf("*/");
        
        if(posInicio !=-1&&posFinal!=-1)
        codigo = codigo.substring(0, posInicio) + codigo.substring(posFinal+2);
        
            System.out.println(codigo);
        }while(posInicio !=-1&&posFinal!=-1);
        
        System.out.println("el codigo es: " + codigo);
    }

}
