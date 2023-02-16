//por YAGO
package busquedas;


public class Busquedas {

public static int busquedaBinaria(int[] tabla, int busqueda) {
        boolean buscando = true;
        int pinicio, pfinal, aux, indice = -1;

        pinicio = 0;
        pfinal = tabla.length;

        while (buscando && pinicio < pfinal) {
            aux = (pinicio + pfinal) / 2;
            if (tabla[aux] < busqueda) {
                pinicio = aux;
            } else if (tabla[aux] == busqueda) {
                indice = aux;
                buscando = false;
            } else {
                pfinal = aux;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        int[] tabla = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(busquedaBinaria(tabla, 11));
    }

}