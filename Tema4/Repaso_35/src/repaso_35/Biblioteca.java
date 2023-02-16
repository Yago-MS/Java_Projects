package repaso_35;

/**
 *
 * @author usuario
 */
public class Biblioteca {

    public static boolean esCapicua(int num) {
        boolean capicua = false;
        int numRev = voltea(num);
        if (numRev == num) {
            capicua = true;
        }
        return capicua;
    }

    public static boolean esPrimo(int num) {
        boolean esPrimo = true;
        if (num==4){
        esPrimo = false;
        }
        for (int divisor = 2; divisor < num / 2; divisor++) {
            if (num % divisor == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    public static int siguientePrimo(int num) {
        int primo;
        boolean parar = true;
        for (primo = num + 1; !parar; primo++) {
            parar = esPrimo(primo);
        }
        return primo;
    }

    public static int potencia(int num, int exp) {
        int multi = num;
        while (exp > 0) {
            num = num * multi;
            exp--;
        }
        return num;
    }

    public static int digitos(int num) {
        int cont = 0;
        while (num > 0) {
            num /=10;
            cont++;
        }
        return cont;
    }
    public static int voltea(int num){
        int numRev=0;
        
        for (int numAux=num, dig=0;numAux>0;numAux/=10){
        dig = numAux%10;
        numRev = numRev * 10 + dig;
        }
        return numRev;
    }
    public static void digitoN(int num, int digN){
        num = voltea(num);
       for (int numAux=num, cont=0, dig=0;numAux>0;numAux/=10){
           dig = numAux%10;
           if (cont == digN){
               System.out.println(dig);
           }
           cont++;
       }
    }
    public static void posicionDeDigito(int num, int digN){
    num = voltea(num);
    boolean encuentra = false;
    for (int numAux=num, cont=0, dig=0 ;numAux>0;numAux/=10){
        dig = numAux%10;
        cont++;
        if (dig == digN){
            System.out.println(cont);
            encuentra = true;
        }
    }
        if (!encuentra){
        System.out.println(-1);
        }
    }
    public static int quitaPorDetras(int num, int nDig){
        while (nDig>0){
        num/=10;
        nDig--;
        }
        return num;
    }
    public static int quitaPorDelante(int num, int nDig){
       num = voltea(num);
       num =quitaPorDetras(num, nDig);
       num = voltea(num);
       return num;
    }
    public static int pegaPorDetras(int num, int dig){
        num = (num*10) + dig;
        return num;
    }
   public static int pegaPorDelante(int num, int dig){
       num = voltea(num);
       num = (num*10) + dig;
       num = voltea(num);
       return num;
   }
   public static int trozoDeNumero(int num, int nDig, int nDig2){
       num =  quitaPorDetras(num,(digitos(num)- nDig2));
       num = quitaPorDelante(num,(nDig2-1));
       return num;
   }
   public static int juntaNumeros(int num1, int num2){
       int numAux = num2, contC=0;
       while (numAux>0){
       numAux/=10;
       contC++;
       }
       while (contC>0){
       num1 = num1*10;
       contC--;
       }
       return num1+num2;
   }
}

