//por YAGO
package act_res51;


public class Act_Res51 {

    public static int[] genN(int tabla[]){
        for (int indice=0;indice<tabla.length;indice++){
       tabla[indice]= (int)(Math.random()*100 + 1);
            System.out.println(tabla[indice]);
       }
     return tabla;
    }
    
    public static int sumaT(int tabla[]){
    int suma=0;
    
    for (int indice=0;indice<tabla.length;indice++){
    suma = suma + tabla[indice];
    }
        return suma;}
    
    public static void main(String[] args) {
       int[] tabla = new int[10];
       int suma=0;
     
       tabla = genN(tabla);  
       suma = sumaT(tabla);
        System.out.println(suma);
    }

}
