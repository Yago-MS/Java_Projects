package act_aplic129;

import java.util.Scanner;

public class Act_Aplic219 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grados, equivalente;
        double radianes;

        System.out.println("Inserte los grados");
        grados = sc.nextInt();

        if (grados > 360 || grados < 0) {
            equivalente = grados % 360;
            radianes = (equivalente * Math.PI) / 180;
            System.out.println("Los radianes son" + radianes);
        } else {
            radianes = (grados * Math.PI) / 180;
            System.out.println("Los radianes son" + radianes);
        }

    }

}
