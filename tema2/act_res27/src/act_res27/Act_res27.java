package act_res27;

import java.util.Scanner;

public class Act_Res27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, año;
        boolean fecha;

        System.out.println("Introduzca dia:");
        dia = sc.nextInt();
        System.out.println("Introduzca el mes:");
        mes = sc.nextInt();
        System.out.println("Introduzca el año:");
        año = sc.nextInt();

        if (año == 0) {
            fecha = false;
        } else {
            if (mes == 2 && (1 <= dia && dia <= 28)) {
                fecha = true;
            } else 
                if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)
                        && (dia <= 1 && dia >= 30)) {
                    fecha = true;
                } else {
                    if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                            && (1 <= dia && dia <= 31)) {
                        fecha = true;
                    } else {
                        fecha = false;
                    }
                }
                if (fecha == true) {
                    System.out.println("La fecha es... ¡Correcta!" + dia + mes + año);
                } else {
                    System.out.println("fecha incorrecta");
                }

            

        }

    }
}
