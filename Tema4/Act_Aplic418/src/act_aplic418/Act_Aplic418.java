//por YAGO
package act_aplic418;


public class Act_Aplic418 {
    public static void rand(int num, int min, int max){
        max = (max - min)+1;
        for (int cont=0;cont<num;cont++){
            System.out.println((int)(Math.random()*max) + min);
        }
        
    }
    
    public static void main(String[] args) {
       int num=10, min=20, max=44;
        System.out.println("suponiendo que el numero es 10, el minimo es 20 y el maximo 44");
        
       
       rand(num,min,max);
    }

}
