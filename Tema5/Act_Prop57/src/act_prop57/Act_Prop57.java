//por YAGO
package act_prop57;

import static act_prop57.CopiaArrays.*;

public class Act_Prop57 {

    public static void main(String[] args) {
        int pos1=0, pos2=0, res;
        int[] t = new int[]{2, 5, 7, 8, 9, 10, 23};

        
        while (t.length > 1) {
            
            do {
            pos1 = (int) (Math.random() * t.length);
            pos2 = (int) (Math.random() * t.length-1);
        } while (pos1 == pos2);

            res = (t[pos1] + t[pos2]) / 2;

            t = eliminarOrdenada(t, t[pos1]);
            t = eliminarOrdenada(t, t[pos2]);

            t = insercionOrdenada(t, res);
        }
        System.out.println("tu numero de la suerte es:");
        mostrarArray(t);
    }

}
