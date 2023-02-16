//por YAGO
package repasototal;

public class RepasoTotal {

    public static void main(String[] args) {
        int alt, cont = 0;

        alt = 10;
        for (int altAux = alt; altAux > 0; altAux--) {
            int pint = 3;
            int pint2 = pint + cont;
            cont++;
            for (int esp = altAux; esp > 0; esp--) {
                System.out.print(" ");
            }

            for (int i = 1; i < cont; i++) {
                System.out.print(pint2 % 10);
                pint2--;
            }
            for (int i = 1; i <= cont; i++) {
                System.out.print(pint % 10);
                pint++;

            }
            System.out.println("");
        }
    }
}
