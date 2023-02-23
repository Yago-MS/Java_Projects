//Por YAGO

package act_aplic712;

public class Ecuaciones {
    public static double[] ecuacion2Grado(int a, int b, int c) {
 
    double discriminante = (Math.pow(b, 2) - (4 * a * c));
    if (discriminante >= 0) {
 
        double soluciones[];
 
        // Una solucion
        if(discriminante == 0){
 
            soluciones = new double[1];
 
            soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
 
        // Dos soluciones
        }else{
 
            soluciones = new double[2];
 
            soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
 
            soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
 
        }
 
        return soluciones;
    } else {
        // Sin solucion
        return null;
    }
 
}
}
