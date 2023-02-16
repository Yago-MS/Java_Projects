
package repaso35;

import java.util.Scanner;


public class Repaso35 {

    
public static void main(String[] args) {
        int h;
        int numEsp=0;
        
        Scanner sc = new Scanner (System.in);
        
        do{
            System.out.println("Escribe la altura de la X: ");
            h=sc.nextInt();
        }while(h<3 || (h%2==0));
        
        for (int numH=0; numH<h;numH++){
            for(int i=0;i<numEsp;i++){
                System.out.print(" ");
            }
            
            for (int numLin=h-(numEsp*2); numLin>0; numLin--){
                if(numLin==h-(numEsp*2) || numLin==1){
                    System.out.print("*");
                }else {System.out.print(" ");}
            }
            
            System.out.println("");
            if (numH<h/2){
                numEsp++;
            }else{numEsp--;}
        }
        
    }
    
}
