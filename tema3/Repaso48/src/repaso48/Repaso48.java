//por YAGO
package repaso48;

import javax.swing.JOptionPane;


public class Repaso48 {

    
    public static void main(String[] args) {
    long num, numAux, cifra;
        boolean comparador = false;

       
        do {
            String input = JOptionPane.showInputDialog("inserte un numero:");
            numAux = num = Long.parseLong(input);
        } while (num <= 0);

        System.out.print("Los numeros que salen son: ");

        for (int dig = 0; dig != 10; dig++) {
            numAux=num;
            
            while (numAux != 0) {
                cifra = numAux % 10;
                numAux = numAux / 10;
                
                if(dig==cifra){
                    comparador=true;
                }
            }
            
            if(comparador){
            System.out.print(dig+" ");
            }
            comparador=false;

        }
        
        System.out.println("");
        System.out.print("Los numeros que faltan son: ");
        
        for (int dig=0; dig!=10;dig++){
            numAux=num;
            comparador = true;
            
            while (numAux !=0){
                cifra=numAux%10;
                numAux=numAux/10;
                
                if (dig==cifra){
                    comparador = false;
                }
            }
            if (comparador){
                    System.out.print(dig+" ");
                }
        }
    }

}