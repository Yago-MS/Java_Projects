//por YAGO
package examentema4;

public class ExamenTema4 {

    public static int potencia(int num, int potencia) {
        int multi = num;
        while (potencia > 1) {
            num = num * multi;
            potencia--;
        }
        return num;
    }

    public static int digitos(int num) {
        int numAux = num, cont = 1;
        while (numAux > 9) {
            numAux /= 10;
            cont++;
        }
        return cont;
    }

    public static boolean narcisista(int num) {
        int potencia = digitos(num), numAux = num, total = 0;

        boolean narcisista = false;

        for (int dig; numAux > 0; numAux /= 10) {

            dig = numAux % 10;
            total = total + potencia(dig, potencia);
        }
        if (num == total) {
            narcisista = true;
        }
        return narcisista;
    }

    public static void main(String[] args) {
        int num = 0, cont = 1;
        System.out.println("Los primeros 20 numeros narcisistas son:");
        while (cont <= 20) {
            if (narcisista(num)) {
                System.out.print(num + " ");
                cont++;
            }
            num++;
        }
    }

}
