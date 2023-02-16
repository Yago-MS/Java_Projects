package act_prop25;

import java.util.Scanner;

public class Act_prop25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aforo, numEntradas;
        double precioEntrada, ganancias;
        boolean concierto = false;
        System.out.println("Inserte el aforo máximo:");
        aforo = sc.nextInt();
        System.out.println("Inserte el precio por entrada:");
        precioEntrada = sc.nextDouble();
        System.out.println("Inserte el numero de entradas vendidas:");
        numEntradas = sc.nextInt();

        if (numEntradas > aforo) {
            System.out.println("Los datos no ecajan, repita el proceso.");
           
        } else if (numEntradas <= (aforo * 0.2)) {
            System.out.println("Se cancela el concierto");
            
        } else if (numEntradas < (aforo * 0.5)) {
            precioEntrada = precioEntrada - (precioEntrada * 0.25);
            concierto = true;
        } else {
        concierto = true;
        }
        
        if (concierto) { 
            ganancias = precioEntrada * numEntradas;
            System.out.println("Las ganacias del concierto son:" + ganancias);}
    }

}

