/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_res214;

import java.util.Scanner;

/**
 *
 * @author yagom
 */
public class Act_res214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasMes = 0;
        System.out.println("introduzca el dia");
        int dia = sc.nextInt();
        System.out.println("introduzca el mes");
        int mes = sc.nextInt();
        System.out.println("introduzca el año");
        int año = sc.nextInt();
        
        diasMes = switch (mes){
        
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
        dia++;
        
        if (dia > diasMes){
            dia = 1;
            mes++;
            if (mes > 12){
            mes =1;
            año++;
            }
       if (año == 0){
       año = 1;
       }
      
   }
    System.out.println(dia + "/"+ mes+ "/" + año);
}

}