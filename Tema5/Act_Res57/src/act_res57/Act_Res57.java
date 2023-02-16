//por YAGO
package act_res57;

public class Act_Res57 {

    public static boolean busqueda(int[] tabla, int parametro) {
        boolean encontrar = false;
        for (int indice = 0; indice < tabla.length; indice++) {
            if (tabla[indice] == parametro) {
                encontrar = true;
                indice = tabla.length;
            }
        }

        return encontrar;
    }

    public static int[] copia(int[] tabla, int longitud) {
        int[] copiada = new int[longitud];

        for (int indice = 0; indice < tabla.length && indice < longitud; indice++) {
            copiada[indice] = tabla[indice];
        }

        return copiada;
    }

    public static int[] insercionNoOrdenada(int[] tabla, int elemento) {
        int[] resultado;
        resultado = copia(tabla, tabla.length + 1);
        resultado[resultado.length - 1] = elemento;

        return resultado;
    }

    public static int[] sinRepetidos(int[] t) {
        int[] resultado = new int[0];

        for (int indice = 0; indice < t.length; indice++) {
            if (!busqueda(resultado, t[indice])) {
                resultado = insercionNoOrdenada(resultado, t[indice]);
            }

        }
        return resultado;
    }

    public static void main(String[] args) {

        int[] tabla = {1, 1, 1, 2, 2, 2, 3, 3, 3};

        tabla = sinRepetidos(tabla);
        for (int indice = 0; indice < tabla.length; indice++) {
            System.out.print(tabla[indice] + " ");
        }
    }

}
