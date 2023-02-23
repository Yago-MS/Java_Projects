//por YAGO
package act_aplic715;

import java.util.Scanner;


public class Act_aplic715 {

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Calendario calendario = new Calendario(2001,12,9);
        
        calendario.mostrar();
        calendario.incrementarDia();
        System.out.println("dia incrementado");
        calendario.mostrar();
        calendario.incrementarMes();
        System.out.println("mes incrementado");
        calendario.mostrar();
        System.out.println("inserte años a aumentar:");
        int añosMas = sc.nextInt();
        calendario.incrementarAño(añosMas);
        calendario.mostrar();
        
        int dia2;
        int mes2;
        int año2;
        
        System.out.println("Inserte un nuevo dia");
        dia2 = sc.nextInt();
        System.out.println("Inserte nuevo mes");
        mes2 = sc.nextInt();
        System.out.println("Inserte nuevo año");
        año2 = sc.nextInt();
        
        Calendario calendario2 = new Calendario(año2, mes2, dia2);
        
        if(calendario.iguales(calendario, calendario2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }
                
    }

}
