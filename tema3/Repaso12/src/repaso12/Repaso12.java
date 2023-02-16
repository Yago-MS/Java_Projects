
package repaso12;

import java.util.Scanner;


public class Repaso12 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=0, n2=1, list, cont=2, fibo=0;
       do{
        System.out.println("cuantos numeros debe mostrar?");
        list = sc.nextInt();
       } while (list <=0);
       
            System.out.println(n1);
            if (list>=2)
            System.out.println(n2);
            
            while (cont<list){
                fibo = n1 + n2;
                System.out.println(fibo);
            n1= n2;
            n2 = fibo;
            cont++;
        }
    }

}
