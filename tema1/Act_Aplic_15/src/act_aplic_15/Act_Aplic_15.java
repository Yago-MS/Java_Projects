
package act_aplic_15;

import java.util.Scanner;


public class Act_Aplic_15 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n,factn, factm, total, cont;
        System.out.println("Inserte el numero");
        cont=n = sc.nextInt();
       for (int m=n;cont>0;cont--){
        for(factn=n;n>0;n--){
        factn = factn*n;
        }
        for (factm=m;m>0;m--){
        factm=factm*m;
        }
        total= factm*(factn-factm);
           System.out.println(total);
       }
    }

}
