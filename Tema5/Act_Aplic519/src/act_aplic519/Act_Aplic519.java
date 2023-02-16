package act_aplic519;

import java.util.Arrays;
import java.util.Scanner;

public class Act_Aplic519 {

    public static int busqueda(int num, int[] tabla) {
        int indice = -1;

        for (int recorrer = 0; recorrer < tabla.length; recorrer++) {
            if (tabla[recorrer] == num) {
                indice = recorrer;
            }
        }

        return indice;
    }

    public static int[] enviarFinal(int[] dorsales, int cont) {
        Scanner sc = new Scanner(System.in);
        int dorsal;
        do {//atraso para los dopping
            System.out.println("Inserte numero del dorsal:");
            dorsal = sc.nextInt();
            if (dorsal > 0) {
                int cambio = busqueda(dorsal, dorsales);
                if (cambio >= 0) {
                    int aux = dorsales[cambio];//cojo el que voy a cambiar
                    for (int i = cambio; i < dorsales.length - cont; i++) {//los muevo todos uno delante
                        dorsales[i] = dorsales[i + 1];
                    }
                    dorsales[dorsales.length - cont] = aux;//sobreescribo el ultimo
                    cont++;//siguiente iteracion
                }
            }
        } while (dorsal != -1);
        return dorsales;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dorsales = new int[10];
        int dorsal, cont = 1;

        System.out.println("Inserte los 10 participantes");
        for (int indice = 0; indice < dorsales.length; indice++) {
            System.out.println("Inserte dorsal");
            dorsales[indice] = sc.nextInt();
        }
        System.out.println(Arrays.toString(dorsales));
        System.out.println("Inserte los dorsales de los corredores menores");

        do {//avance para los menores
            System.out.println("Inserte numero del dorsal:");
            dorsal = sc.nextInt();
            if (dorsal > 0) {
                int cambio = busqueda(dorsal, dorsales);
                if (cambio != 0) {
                    int aux = dorsales[cambio - 1];
                    dorsales[cambio - 1] = dorsales[cambio];
                    dorsales[cambio] = aux;
                }

            }

        } while (dorsal != -1);
        System.out.println(Arrays.toString(dorsales));
        System.out.println("inserte los corredores dopados");
        
        dorsales = enviarFinal(dorsales, cont);
        System.out.println(Arrays.toString(dorsales));
        System.out.println("inserte los corredores que no han pagado");
        
        do {//atraso para los no pagados (despues de dopping)
            System.out.println("Inserte numero del dorsal:");
            dorsal = sc.nextInt();
            if (dorsal > 0) {
                int cambio = busqueda(dorsal, dorsales);
                if (cambio>=0){
                int aux = dorsales[cambio];//cojo el que voy a cambiar
                for (int i = cambio; i < dorsales.length - cont; i++) {//los muevo todos uno delante
                    dorsales[i] = dorsales[i + 1];
                }
                dorsales[dorsales.length - cont] = aux;//sobreescribo el ultimo
                cont++;//siguiente iteracion
            }
            }
        } while (dorsal != -1);
        System.out.println(Arrays.toString(dorsales));

    }

}
