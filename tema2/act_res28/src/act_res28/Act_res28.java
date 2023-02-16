package act_res28;

import java.util.Scanner;

public class Act_res28 {

    public static void main(String[] args) {
        double a, b, c;
        double valorInt;                      
        double resul1, resul2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor a segun la formaula: ");
        a = sc.nextDouble();
        System.out.println("Ingrese el valor b segun la formaula: ");
        b = sc.nextDouble();
        System.out.println("Ingrese el valor c segun la formaula: ");
        c = sc.nextDouble();

        valorInt = b * b - 4 * a * c;                    

        if (a == 0) {                            
            System.out.println("Esto no es una ecuacion de segundo grado");
        } else if (valorInt < 0) {            
            System.out.println("Esta ecuacion no tiene solocion");
        } else if (valorInt >= 0) {         
            resul1 = ((-b) + Math.sqrt(valorInt)) / (2 * a);
            resul2 = ((-b) - Math.sqrt(valorInt)) / (2 * a);

            if (resul1 == resul2) {                       
                System.out.println("La solucion de la ecuacion es: " + resul1);
            } else {                                      
                System.out.println("Las soluciones de la ecuacion:");
                System.out.println("Solucion1: " + resul1);
                System.out.println("Solucion2: " + resul2);
            }
        }
    }

}
