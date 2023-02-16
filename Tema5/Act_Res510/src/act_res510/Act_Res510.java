//por YAGO
package act_res510;

import static act_res510.CopiaArrays.*;
import java.util.Arrays;
import java.util.Scanner;

public class Act_Res510 {

       public static int[] eliminarMayores(int[] tabla, int valor){
           int copia [] = copia (tabla, tabla.length);
           for (int indice = 0;indice<copia.length;indice++){
           if (copia[indice]>valor){
           copia[indice] = copia[copia.length-1];
           copia = copia(copia, copia[copia.length-1]);
           } else{
           indice++;
           }
           }
           return copia;
           
    }
    

    public static void main(String[] args) {
        int[] tabla = {1,5,7,2,1,4};
        int valor = 6;
        tabla = eliminarMayores(tabla, valor);
        mostrarArray(tabla);
    }

}

