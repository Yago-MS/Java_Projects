//por YAGO
package act_res512;

import java.util.Arrays;


public class Act_Res512 {

    
    public static void main(String[] args) {
       int[][] tabla = new int[5][5];
       
       for(int indice1 = 0;indice1<5;indice1++){
           for (int indice2 = 0; indice2<5;indice2++){
           tabla[indice1][indice2]= 10 * indice1+indice2;
           }
           
       }
       for(int indice1 = 0;indice1<5;indice1++){
           for (int indice2 = 0; indice2<5;indice2++){
               System.out.print(tabla[indice1][indice2] + " ");
           }
           System.out.println("");
    }
       
    }
}
