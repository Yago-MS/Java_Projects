//por YAGO
package multiplicacionrusa;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MultiplicacionRusa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicador, multiplicando, sum = 0;
        do {
            String input = JOptionPane.showInputDialog("Inserte el multiplicador:");
            multiplicador = Integer.parseInt(input);
        } while (multiplicador <0);
        do {
            String input = JOptionPane.showInputDialog("Inserte el multiplicando:");
            multiplicando = Integer.parseInt(input);
        } while (multiplicando < 0);
        while (multiplicador > 0) {
            if (multiplicador % 2 != 0) {
                sum = sum + multiplicando;
            }
            multiplicador /= 2;
            multiplicando *= 2;
        }

        JOptionPane.showInternalMessageDialog(null, "La suma es:" + sum);
        System.out.println("");
    }

}
