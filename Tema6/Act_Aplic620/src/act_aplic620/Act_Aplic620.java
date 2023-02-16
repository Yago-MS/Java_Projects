//por YAGO
package act_aplic620;

import java.util.Arrays;
import java.util.Scanner;


public class Act_Aplic620 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserta la frase:");
        String frase = sc.nextLine();
        
        int totalContactos=0;
                
                for (int i = 0; i < frase.length(); i++) {
                    if(frase.charAt(i)==' '){
                    totalContactos++;
                    }
                }
                    if(totalContactos>0){
                    String[] grupoPalabras = new String[totalContactos+1];
                    int indice=0;
                        for (int j = 0; j < grupoPalabras.length; j++) {
                            String contactoActual = "";
                            
                            while(indice<frase.length()&& frase.charAt(indice)!=' '){
                            contactoActual += frase.charAt(indice);
                            indice++;
                            }
                            indice++;
                            grupoPalabras[j] = contactoActual;
                            
                        }
                        Arrays.sort(grupoPalabras);
                        
                        System.out.println("Las palabras ordenadas son:");
                        
                        for (int j = 0; j < grupoPalabras.length; j++) {
                            System.out.println(grupoPalabras[j]);
                            
                        }
                    
                    }



    }

}
