package act_aplic118;
import java.util.Scanner;

public class Act_aplic118 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int patasHormiga, patasAraña, patasCochinilla;
        System.out.println("Inserte el numero de hormigas:");
            int numHormigas = sc.nextInt();
        System.out.println("Inserte el numero de arañas:");
            int numArañas = sc.nextInt();
        System.out.println("Inserte el numero de coshinillas:");
            int numCochinillas = sc.nextInt();
        
        patasHormiga = numHormigas * 6;
        patasAraña = numArañas * 8;
        patasCochinilla = numCochinillas * 14;
        
        System.out.println("el numero total de patas es " + (patasHormiga + patasAraña + patasCochinilla));
        
    }
    
}
