//por YAGO
package act_aplic415;

public class Act_Aplic415 {

    public static int difMin(int hora1, int min1, int hora2, int min2) {
        int dif;
        min1 = min1 + (hora1 * 60);
        min2 = min2 + (hora2 * 60);
        dif = Math.abs(min1 - min2);
        return dif;
    }

    public static void main(String[] args) {
        int h1 = 10, h2 = 10, min1 = 40, min2 = 41;
        System.out.println("Suponiendo que: h1, min1 y h2, min2 son: 20, 40 y 10, 23 respectivamente...");
        System.out.println(difMin(h1, min1, h2, min2) + " minutos de diferencia");
    }

}
