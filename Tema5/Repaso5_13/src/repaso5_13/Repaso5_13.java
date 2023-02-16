//por YAGO
package repaso5_13;

public class Repaso5_13 {

    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] stats = new int[4][10];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                stats[i][j] = (int) (Math.random() * (210 - 140 + 1)) + 140;
            }
        }

        System.out.printf("%64s\n", "MED MIN MAX");
        for (int i = 0; i < 4; i++) {
            int maximo = 140;
            int minimo = 210;
            int suma = 0;
            
            System.out.printf("%9s:", pais[i]);
            
            for (int stat : stats[i]) {
                System.out.printf("%4d", stat);
                maximo = stat > maximo ? stat : maximo;
                minimo = stat < minimo ? stat : minimo;
                suma += stat;
            }
            System.out.printf(" |%4d%4d%4d\n", (suma/10), minimo, maximo);
        }
    }
}
