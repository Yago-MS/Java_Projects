//Por YAGO

package act_aplic7.pkg13;

import java.util.Arrays;

public class Colores {
    String [] colores;
    
    public Colores(){
    colores = new String[2];
    colores[0] = "Azul";
    colores[1] = "Rojo";
    colores[2] = "Amarillo";
    }
    
    void nuevoColor (String colorNuevo){
    colores = Arrays.copyOf(colores, colores.length +1);
    colores[colores.length-1] = colorNuevo;
    }
    
    void muestraColores (int n){
    if(n<colores.length&&n>0){
        
    }else{
        System.out.println("No hay tantos colores");
    }
    }
}
