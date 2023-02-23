//por YAGO
package act_res71;

import java.util.Scanner;


public class Act_res71 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaCorriente c;
        c = new CuentaCorriente("12345678A", "María");
        char respuesta;
        do {
            System.out.println("¿Que quieres hacer? (I (ingreso) E(egreso) S(Salir))");
            respuesta = sc.nextLine().charAt(0);
            switch (respuesta) {
                case 'I' -> {
                    System.out.println("Inserta cantidad");
                    double cantidad = sc.nextDouble();
                    c.ingresarDinero(cantidad);
                    System.out.println("Has ingresado: " + cantidad);
                sc.nextLine();
                }
                case 'E' -> {
                    System.out.println("Inserta cantidad");
                    double cantidad = sc.nextDouble();
                    if (c.sacarDinero(cantidad)) {
                        System.out.println("Has sacado: " + cantidad);
                    } else {
                        System.out.println("No tienes ese dinero");
                    }
                    sc.nextLine();
                }
                case 'S' -> {
                    System.out.println("Hasta la proxima!");
                }
                default -> {
                System.out.println("por favor, vuelve a intentarlo");
                sc.nextLine();
                }
            }
            
        } while (respuesta != 'S');
    }

}
