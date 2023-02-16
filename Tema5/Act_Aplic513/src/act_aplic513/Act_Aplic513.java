//por YAGO
package act_aplic513;


public class Act_Aplic513 {

    public static int[] desorden(int[] tabla){
        int rand1, rand2, aux;
        int[] tabla2 = tabla;
        
        for (int cont=0;cont<tabla2.length;cont++){
        
            rand1=(int)(Math.random()*tabla2.length);
            rand2=(int)(Math.random()*tabla2.length);
        aux = tabla2[rand2];
        tabla2[rand2]=tabla2[rand1];
        tabla2[rand1]=aux;
        }
        
        return tabla;
    }
    
    public static void main(String[] args) {
       int[] tabla = new int[]{1, 3, 5, 19, 23, 24};
       
       for (int cont = 0; cont < tabla.length; cont++) {
            System.out.print(tabla[cont] + " ");
        }
        System.out.println("");

        desorden(tabla);

        for (int cont = 0; cont < tabla.length; cont++) {
            System.out.print(tabla[cont] + " ");
        }
    }

}
