//por YAGO
package act_prop52;

public class Act_Prop52 {

    public static int numeroElementoMayor(double[] lista, double limite) {
        int nuevoTamano = 0;

        for (int indice = 0; indice < lista.length; indice++) {
            if (lista[indice] > limite) {
                nuevoTamano++;
            }
        }

        return nuevoTamano;
    }

    public static void main(String[] args) {
                
        double lista[] = {1.23, 2.07, 1.74, 1.86, 1.35}, lista2[] = new double[numeroElementoMayor(lista, 1.50)];

        for (int indice = 0, indice2 = 0; indice < lista.length; indice++) {
            if (lista[indice] > 1.50) {
                lista2[indice2] = lista[indice];
                indice2++;
            }
        }
        lista = null;

        for (int indice = 0; indice < lista2.length; indice++) {
            System.out.println(lista2[indice]);
        }
    }

}
