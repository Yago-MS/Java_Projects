package act_aplic320;

import java.util.Scanner;

public class Act_Aplic320 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total, cant1 = 0, cant2 = 0, cant3 = 0, cant4 = 0, suma = 1;

        while (suma > 0) {
            System.out.println("introduzca su dinero en el banco");
            suma = sc.nextInt();
            cant1 = cant1 + suma;
        }
        suma++;
        while (suma > 0) {
            System.out.println("introduzca su dinero en la hucha");
            suma = sc.nextInt();
            cant2 = cant2 + suma;
        }
        suma++;
        while (suma > 0) {
            System.out.println("introduzca su dinero en el cajón");
            suma = sc.nextInt();
            cant3 = cant3 + suma;
        }
        suma++;
        while (suma > 0) {
            System.out.println("introduzca su dinero en los bolsillos");
            suma = sc.nextInt();
            cant4 = cant4 + suma;
        }
        total=cant1+cant2+cant3+cant4;
        
        System.out.println("su total de dinero es:"+ total);
    }

}
