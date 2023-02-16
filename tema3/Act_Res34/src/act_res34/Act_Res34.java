package act_res34;

import java.util.Scanner;

public class Act_Res34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alt,masAlt=0, etiqueta=0, etiquetaMasAlt=0;
        System.out.println("Introduzca la altura (cm):");
        alt = sc.nextInt();
        
        while (alt > 0){
            
            if (masAlt < alt ){
            masAlt = alt;
            etiquetaMasAlt = etiqueta;
            }
            System.out.println("Introduzca la altura (cm):");
            alt = sc.nextInt();
            etiqueta++;
        }
        System.out.println("El arbol mas alto mide:" + masAlt);
        System.out.println("Y su etiqueta es:" + etiquetaMasAlt);
    }
    
}
