//por YAGO
package act_aplic417;

public class Act_Aplic417 {

    public static boolean amigos(int num1, int num2) {
        int div1 = 0, div2 = 0;
        boolean amigos = false;

        for (int cont = 1; cont <= num1; cont++) {
            if (num1 % cont == 0) {
                div1 = div1 + cont;
            }
        }
        for (int cont = 1; cont <= num2; cont++) {
            if (num1 % cont == 0) {
                div2 = div2 + cont;
            }
        }
        if (div1 == div2) {
            amigos = true;
        }
        return amigos;
    }

    public static void main(String[] args) {
        int num1 = 220, num2 = 284;
        System.out.println("suponiendo que el numero 1 es 220 y el numero 2 es 284...");
        if (amigos(num1, num2)) {
            System.out.println("los numeros son amigos");
        } else {
            System.out.println("los numeros no son amigos");
        }

    }

}
