/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad110;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Actividad110 {

    public static void main(String[] args) {
       boolean llueve, tareaHecha, biblioteca;
       boolean resp;
       Scanner sc = new Scanner(System.in);
        System.out.println("Está lloviendo? (true/false)" );
        llueve = sc.nextBoolean();
        System.out.println("Has hecho tus tareas? (true/false");
        tareaHecha = sc.nextBoolean();
        System.out.println("Tienes que ir a la biblioteca? (true/false)");
        biblioteca = sc.nextBoolean();
        
      resp = (!llueve && tareaHecha) || biblioteca;
        
      System.out.println("sales a la calle " + resp);
    
}
}
