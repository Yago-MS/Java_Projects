
package act_aplic310;


public class Act_Aplic310 {

    public static void main(String[] args) {
        int cont=0, suma=0;
        for (int num=0;cont<10;num++){
        
            if ((!(num%2==0))){
                suma = suma + num;
            cont++;
            }
            
        }
        System.out.println(suma);
    }
    
}
