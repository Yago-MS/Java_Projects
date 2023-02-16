package act_repaso24;

import java.util.Scanner;

public class Act_repaso24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cargo, viajes, estado, suelBase = 0, dietas, suelBruto, porcentaje = 0;
        double IRPF = 0, retencion, suelNeto;
        System.out.println("1 - Programador junior\n" + "2 - Prog. senior\n"
                + "3 - Jefe de proyecto\n" + "Introduzca el cargo del empleado (1 - 3):");
        cargo = sc.nextInt();
        
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?");
        viajes = sc.nextInt();
        
        System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
        estado = sc.nextInt();
        
        switch (cargo){
        
            case 1 -> suelBase = 950;
            case 2 -> suelBase = 1200;
            case 3 -> suelBase = 1600;
        }
        
        dietas = viajes * 30;
        
        suelBruto = suelBase + dietas;
        
        switch (estado) {
            case 1 -> IRPF = 0.25;
            case 2 -> IRPF = 0.2;
        }
          switch (estado) {
            case 1 -> porcentaje = 25;
            case 2 -> porcentaje = 20;
        }
        
        retencion = suelBruto * IRPF;
        
        suelNeto = suelBruto - retencion;
        
        System.out.println("----------------------------------\n" +
"| Sueldo base"+ suelBase +"\n" +
"| Dietas ( " + viajes +  " viajes) " + dietas +" |\n" +
"|--------------------------------|\n" +
"| Sueldo bruto " + suelBruto + " |\n" +
"| Retención IRPF ("+ porcentaje +"%) " + retencion + " |\n" +
"|--------------------------------|\n" +
"| Sueldo neto "+ suelNeto +" |\n" +
"----------------------------------");
    }
}
