//por YAGO
package act_res511;

import static act_res511.BibliotecaArraysActualizada.*;
import java.util.Scanner;

public class Act_Res511 {

public static int selecDificultad() {
        int dificultad;
        Scanner myVar = new Scanner(System.in);

        do {
            System.out.println("inserte la longitud de la contraseña");
            dificultad = myVar.nextInt();
        } while (dificultad < 1);

        return dificultad;
    }

    public static void main(String[] args) {
        int dificultad=selecDificultad();
        int[] tablaResuelta= ArrayRandom(dificultad, 5);
        int[] tabla=new int[tablaResuelta.length];
        Scanner myVar= new Scanner (System.in);
       
        for(int cont=0; cont<tabla.length; cont++){
            do{
                do{
                    System.out.println("Introduce digito:");
                    tabla[cont]=myVar.nextInt();
                }while(tabla[cont]>5 && tabla[cont]<1);
               
                if(tabla[cont]>tablaResuelta[cont]){
                    System.out.println("El numero es mas pequeño, intentalo de nuevo");
                }
                else if(tabla[cont]<tablaResuelta[cont]){
                    System.out.println("El numero es mas grande, intentalo de nuevo");
                }
            }while(tabla[cont]!=tablaResuelta[cont]);
           
            System.out.println("Bien acertaste el numero");
        }
       
        System.out.println("acertaste!");
    }

}

