/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nombre.completo;
import java.util.Scanner;
import java.util.Locale;
        

/**
 *
 * @author usuario
 */
public class NombreCompleto {

    
   
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);      
    sc.useLocale(Locale.US);
    
    System.out.println("Introduce tu edad:");
         double edad = sc.nextInt();
        sc.nextLine();
    System.out.println("Introduce tu nombre:");
         String nombre = sc.next();
        System.out.println( nombre + "-" + edad);
    }
    
}
