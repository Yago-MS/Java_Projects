package act_aplic213;

import java.util.Scanner;

public class Act_aplic213 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double comidaDiaria, numAnimales, kilosAnimal, kilosNecesarios, comidaAnimal = 0;

        System.out.println("inserte la comida comprada");
        comidaDiaria = sc.nextDouble();
        System.out.println("Inserte el numero de animales");
        numAnimales = sc.nextDouble();
        System.out.println("Inserte la media de kilos por animal");
        kilosAnimal = sc.nextDouble();

        kilosNecesarios = numAnimales * kilosAnimal;

        if (comidaDiaria >= kilosNecesarios && numAnimales != 0) {
            System.out.println("Tiene comida suficiente");

        } else if (comidaDiaria < kilosNecesarios && numAnimales != 0) {
            comidaAnimal = comidaDiaria / numAnimales;
        }
        if (comidaAnimal > 0) {
            System.out.println("No hay comida suficiente, por ende:");
            System.out.printf("Cada animal comerá: %.2f", comidaAnimal);
        } else {
            System.out.println("Inserte datos válidos por favor");
        }
    }

}
