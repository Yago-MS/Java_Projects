//por YAGO
package exament5;

public class ExamenT5 {

    public static boolean repetidoArray(int[] tabla, int num) {
        boolean repetido = false;

        for (int indice = 0; indice < tabla.length; indice++) {
            if (num == tabla[indice]) {
                repetido = true;
            }
        }

        return repetido;
    }

    public static boolean comprobarMultiplos3(int num) {
        boolean esMultiplo = false;
        if (num % 3 == 0) {
            esMultiplo = true;
        }
        return esMultiplo;
    }
    public static int[] moverMultiplos3(int[]tabla){
        int cont=0;
        for(int indice=1;indice<tabla.length;indice++){
        
            if(comprobarMultiplos3(tabla[indice])){
            int aux = tabla[cont];
            tabla[cont] = tabla[indice];
            tabla[indice] = aux;
            cont++;
            }
        
        }
        return tabla;
    }
    public static int contarMultiplos3(int[] tabla){
        int contMulti=0;
        for(int indice=0;indice<tabla.length;indice++){
        if(comprobarMultiplos3(tabla[indice])){
        contMulti++;
        }
        }
    return contMulti;
    }
    public static int[] ordenarMultiplos3(int[] tabla){
    int contMulti=contarMultiplos3(tabla);
        
    
        for(int indice=0;indice<contMulti;indice++){
        for(int indice2=indice+1;indice2<contMulti;indice2++)
            if(tabla[indice]>tabla[indice2]){
        int aux = tabla[indice];
        tabla[indice] = tabla[indice2];
        tabla[indice2]= aux;
        }
        
        }
    
        return tabla;
    }
    public static int[] ordenarNoMultiplos3(int[]tabla){
    int contMulti=contarMultiplos3(tabla);
    
        for(int indice=contMulti;indice<tabla.length;indice++){
        for(int indice2=indice+1;indice2<tabla.length;indice2++)
        if(tabla[indice]<tabla[indice2]){
        int aux = tabla[indice];
        tabla[indice] = tabla[indice2];
        tabla[indice2]= aux;
        }
        
        }
    
    
    return tabla;
    }

    public static void main(String[] args) {
        int[] tabla = new int[(int) (Math.random() * 5) + 10];

        for (int indice = 0; indice < tabla.length; indice++) {
            int num = (int) (Math.random() * 100);
            if (repetidoArray(tabla, num)) {
                indice--;
            } else {
                tabla[indice] = num;
            }

        }
        for (int indice = 0; indice < tabla.length; indice++) {
            System.out.print(tabla[indice] + " ");

        }
        System.out.print(" tabla normal");
        System.out.println("");
        tabla = moverMultiplos3(tabla);
        for (int indice = 0; indice < tabla.length; indice++) {
            System.out.print(tabla[indice] + " ");
        }
        System.out.print(" tabla con los multiplos a la izquierda");
        System.out.println("");
        tabla = ordenarMultiplos3(tabla);
        for (int indice = 0; indice < tabla.length; indice++) {
            System.out.print(tabla[indice] + " ");

        }
        System.out.print(" tabla con los multiplos ordenados");
        System.out.println("");
        tabla = ordenarNoMultiplos3(tabla);
        for (int indice = 0; indice < tabla.length; indice++) {
            System.out.print(tabla[indice] + " ");

        }
        System.out.print(" tabla con los no multiplos ");
    }

}
