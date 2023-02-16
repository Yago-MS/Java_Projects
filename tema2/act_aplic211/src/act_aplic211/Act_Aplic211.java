
package act_aplic211;

import java.util.Scanner;


public class Act_Aplic211 {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int numero;
        int primeraCifra;
        int segundaCifra;
        int terceraCifra;
        int cuartaCifra;
        boolean capicuo;
        
        System.out.println("Introduzca un numero (maximo 9999): ");
        numero = sc.nextInt();
        
        primeraCifra = numero % 10;
        segundaCifra = numero % 100 / 10;
        terceraCifra = numero % 1000 / 100;
        cuartaCifra = numero / 1000;
        
        if (numero < 10) {
            capicuo = true;
        } else if (numero < 100) {
            capicuo = primeraCifra == segundaCifra;
        } else if (numero < 1000) {
            capicuo = primeraCifra == terceraCifra;
        } else {
            capicuo = primeraCifra == cuartaCifra && segundaCifra == terceraCifra;
        }
            
        System.out.println("Es capicuo: " + capicuo);
        
    }
    
}