//por YAGO
package act_aplic520;

import java.util.Arrays;


public class Act_Aplic520 {
    public static int[] mergeSort(int[]tabla1, int[]tabla2){
    int[] ordenada = new int[tabla1.length + tabla2.length];
    int indice1=0, indice2=0;
    
    for(int recorrer=0;recorrer<ordenada.length;recorrer++){
    
        if (indice1 < tabla1.length) {//comparo si el indice sigue dentro del rango
            if (indice2 < tabla2.length) {//lo mismo con el segundo indice
                
                if (tabla1[indice1] < tabla2[indice2]) {//comparo los numeros
                    ordenada[recorrer] = tabla1[indice1];//asigno valores
                    indice1++;//aumento el indice
                } else {//hago lo contrario
                    ordenada[recorrer] = tabla2[indice2];
                    indice2++;//aumento el segundo indice
                }
      
            } else{//asigno el resto de valores de la primera tabla
            ordenada[recorrer]=tabla1[indice1];
            indice1++;
            }
        
        } else{//asigno el resto de valores de la segunda tabla
            ordenada[recorrer]=tabla2[indice2];   
        indice2++;
        }
    } 
    
    return ordenada;
    }
    
    public static void main(String[] args) {
       int[] array1 = new int[]{1,2,4};
       int[] array2 = new int[]{3,5,6};
       int[] ordenada = new int[array1.length + array2.length];
       
       ordenada= mergeSort(array1, array2);
        System.out.println(Arrays.toString(ordenada));
       
    }

}
