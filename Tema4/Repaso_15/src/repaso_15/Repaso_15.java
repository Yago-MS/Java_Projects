//por YAGO
package repaso_15;

import static repaso1_14.Biblioteca.esPrimo;


public class Repaso_15 {

    
    public static void main(String[] args) {
        int num=1;
        
        while (num<=1000){
        if (esPrimo(num)){
                System.out.println(num);}
            num++;}
        
        
    }

}
