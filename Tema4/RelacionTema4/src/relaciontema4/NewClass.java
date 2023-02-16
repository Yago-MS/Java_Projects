package relaciontema4;


/**
 *
 * @author usuario
 */
public class NewClass {
    public static boolean esPrimo(int a) {
        boolean res = true;
        for (int i = 2; i <= (a / 2); i++) {
            if (a % i == 0) {
                res = false;
            }
        }
        return res;
    }
}
