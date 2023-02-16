package act_res211;

import java.util.Scanner;


public class Act_res211 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        System.out.println("introduzca un numero del 1 al 7");
        dia = sc.nextInt();
        
        switch (dia){
        
            case 1 -> System.out.println("lunes"); 
            case 2 -> System.out.println("Martes"); 
            case 3 -> System.out.println("Miercoles"); 
            case 4 -> System.out.println("Jueves"); 
            case 5 -> System.out.println("Viernes"); 
            case 6 -> System.out.println("Sábado"); 
            case 7 -> System.out.println("Domingo"); 
            default -> System.out.println("introduzca un numero válido");
        }
        
    }
    
}
