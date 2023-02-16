//por YAGO
package act_aplic514;

import java.util.Arrays;
import java.util.Scanner;

public class Act_Aplic514 {

    public static void burbuja_decreciente(int[] tabla) {
        boolean cambio = true;
        int aux, limite = tabla.length;

        while (cambio) {
            cambio = false;

            for (int cont = 0; cont < limite - 1; cont++) {
                if (tabla[cont] < tabla[cont + 1]) {
                    aux = tabla[cont + 1];
                    tabla[cont + 1] = tabla[cont];
                    tabla[cont] = aux;
                    cambio = true;
                }
            }
            limite--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo = 0, longitud = 0, maximo = 0, minimo = 350000000, media=0;
        int[] tabla = new int[50];
        do {

            System.out.println("Inserte un sueldo");
            sueldo = sc.nextInt();
            longitud++;
            tabla[longitud - 1] = sueldo;
            if (sueldo > maximo) {
                maximo = sueldo;
            }
            if (sueldo < minimo && sueldo>0) {
                minimo = sueldo;
            }
            if(sueldo>0)
            media = media + sueldo;
        } while (sueldo > 0);

        burbuja_decreciente(tabla);
        for (int indice = 0; indice < tabla.length; indice++) {
            if (tabla[indice] > 0) {
                System.out.println(tabla[indice]);
            }
        }
        System.out.println("el minimo es " + minimo);
        System.out.println("el maximo es " + maximo);
        System.out.println("la media es " + media/(longitud-1));
    }
}
       


