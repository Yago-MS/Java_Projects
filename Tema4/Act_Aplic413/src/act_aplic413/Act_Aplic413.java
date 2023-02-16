//por YAGO
package act_aplic413;


public class Act_Aplic413 {

    public static void muestraImpares(int n){
        for(int cont=1;cont<=2*n;cont++){
            if(cont%2==0){
                System.out.println(cont);
            }
        }
    }
    public static void main(String[] args) {
        int n=22;
        System.out.println("suponiendo que el numero es 22");
        muestraImpares(n);
    }

}
