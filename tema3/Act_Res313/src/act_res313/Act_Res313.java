
package act_res313;

import java.util.Scanner;


public class Act_Res313 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int nota, cont=6, nApr=0, nSus=0, nCon=0;
       do{
           System.out.println("Inserte la nota");
           nota = sc.nextInt();
           if (nota>5){
           nApr++;
           }else if (nota==4){
           nCon++;
           }else if(nota<4){
           nSus++;
           }
           
           cont--;
       }while(cont>0);
        System.out.println("El número de aprobados es: "+ nApr);
        System.out.println("El número de suspensos es: " + nSus);
        System.out.println("El número de condicionales es:" + nCon);
    }
    

}
