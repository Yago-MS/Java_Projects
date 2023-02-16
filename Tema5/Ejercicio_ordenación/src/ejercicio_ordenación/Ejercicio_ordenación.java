//por yago
package ejercicio_ordenación;

public class Ejercicio_ordenación {

    public static void seleccion(int[] tabla) {
        int posMenor, menor;

        for (int cont = 0; cont < tabla.length; cont++) {
            posMenor = cont;
            for (int subCont = cont; subCont < tabla.length; subCont++) {
                posMenor = tabla[posMenor] < tabla[subCont] ? posMenor : subCont;
            }
            menor = tabla[posMenor];
            tabla[posMenor] = tabla[cont];
            tabla[cont] = menor;
        }
    }

    public static void burbuja(int[] tabla) {
        boolean cambio = true;
        int aux, limite = tabla.length;

        while (cambio) {
            cambio = false;

            for (int cont = 0; cont < limite - 1; cont++) {
                if (tabla[cont] > tabla[cont + 1]) {
                    aux = tabla[cont + 1];
                    tabla[cont + 1] = tabla[cont];
                    tabla[cont] = aux;
                    cambio = true;
                }
            }
            limite--;
        }
    }

    public static void insercion(int[] tabla) {
        for (int cont = 1; cont < tabla.length; cont++) {
            int num = tabla[cont];
            int indice = cont - 1;
            while ((indice > -1) && (tabla[indice] > num)) {
                tabla[indice + 1] = tabla[indice];
                indice--;
            }
            tabla[indice + 1] = num;
        }
    } 

    public static void main(String[] args) {
        int[] tabla = {12, 43, 62, 19, 24};

        for (int cont = 0; cont < tabla.length; cont++) {
            System.out.print(tabla[cont] + " ");
        }
        System.out.println("");

        burbuja(tabla);

        for (int cont = 0; cont < tabla.length; cont++) {
            System.out.print(tabla[cont] + " ");
        }
    }
}
