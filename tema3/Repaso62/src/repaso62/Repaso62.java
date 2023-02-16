//por YAGO
package repaso62;

import javax.swing.JOptionPane;


public class Repaso62 {

    
    public static void main(String[] args) {
        int num, contSuerte=0, contMalaSuerte=0;
        
       do {
        String input = JOptionPane.showInputDialog("inserte un numero:");
            num = Integer.parseInt(input);
       }while (num < 0);
       
       for (int dig, numAux = num;numAux!=0;){
           dig = numAux %10;
           if (dig == 3|| dig == 7 || dig == 8|| dig == 9)
               contSuerte++;
           numAux/=10;
       }
       for (int dig, numAux = num;numAux!=0;){
           dig = numAux %10;
           if (dig == 0|| dig == 1 || dig == 2|| dig == 4|| dig == 5 || dig == 6)
               contMalaSuerte++;
           numAux/=10;
       }
       
       if (contMalaSuerte<contSuerte){
           JOptionPane.showMessageDialog(null,
           "El número " + num + " es un número afortunado");
       } else if (contMalaSuerte==contSuerte){
           JOptionPane.showMessageDialog(null,
                   "El número " + num + " no es un número afortunado");
       } else if (contMalaSuerte>contSuerte){
           JOptionPane.showMessageDialog(null,
                   "El número " + num + " no es un numero afortunado");
       }
    }

}
