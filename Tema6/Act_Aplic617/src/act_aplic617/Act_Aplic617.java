package act_aplic617;

import java.util.Scanner;

public class Act_Aplic617 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la palabra");
        String palabra = sc.nextLine();
        System.out.println("Inserte numero de letras por fila");
        int letras = sc.nextInt();
        int cuentaLetras = 0;
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(palabra.charAt(i));
            cuentaLetras++;
            if (cuentaLetras == letras) {
                System.out.println("");
                cuentaLetras = 0;
            }
        }
    }

}
