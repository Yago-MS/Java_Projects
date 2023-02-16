package act_aplic214;

import java.util.Scanner;

public class Act_Aplic214 {

    public static void main(String[] args) {
        int num, numU, numD;
        numD = 0;
        Scanner myVar = new Scanner(System.in);

        System.out.println("Escribe un numero entre el 0 y el 99");
        num = myVar.nextInt();

        numD = num / 10;
        numU = num - numD * 10;

        if (num < 16 && num > 10) {
            switch (num) {
                case 11 ->
                    System.out.println("once");
                case 12 ->
                    System.out.println("doce");
                case 13 ->
                    System.out.println("trece");
                case 14 ->
                    System.out.println("catorce");
                case 15 ->
                    System.out.println("quince");
                case 20 ->
                    System.out.println("vente");
            }
        } else if (numU == 0) {
            switch (numD) {
                case 1 ->
                    System.out.println("diez");
                case 2 ->
                    System.out.println("veinte");
                case 3 ->
                    System.out.println("treinta");
                case 4 ->
                    System.out.println("cuarenta");
                case 5 ->
                    System.out.println("cicuenta");
                case 6 ->
                    System.out.println("sexenta");
                case 7 ->
                    System.out.println("setenta");
                case 8 ->
                    System.out.println("ochenta");
                case 9 ->
                    System.out.println("noventa");
            }
        } else {
            switch (numD) {
                case 1 ->
                    System.out.print("dieci");
                case 2 ->
                    System.out.print("veinti");
                case 3 ->
                    System.out.print("treinta y ");
                case 4 ->
                    System.out.print("cuareta y ");
                case 5 ->
                    System.out.print("cincuenta y ");
                case 6 ->
                    System.out.print("sexenta y ");
                case 7 ->
                    System.out.print("setenta y ");
                case 8 ->
                    System.out.print("ochenta y ");
                case 9 ->
                    System.out.print("nuventa y ");
            }

            switch (numU) {
                case 1 ->
                    System.out.println("uno");
                case 2 ->
                    System.out.println("dos");
                case 3 ->
                    System.out.println("tres");
                case 4 ->
                    System.out.println("cuatro");
                case 5 ->
                    System.out.println("cinco");
                case 6 ->
                    System.out.println("seis");
                case 7 ->
                    System.out.println("siete");
                case 8 ->
                    System.out.println("ocho");
                case 9 ->
                    System.out.println("nueve");
                case 10 ->
                    System.out.println("diez");
            }
        }

    }

}
