//por YAGO
package act_aplic712;


public class Act_aplic712 {

    
    public static void main(String[] args) {
        Ecuaciones ecuacion2Grado = new Ecuaciones();
        System.out.println("x^2 - 5x + 6"); 
    double resultados[] = Ecuaciones.ecuacion2Grado(1, -5, 6);
 
    if (resultados == null) {
        System.out.println("No tiene solucion");
    } else {
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }
    }
 
    System.out.println("x^2 - 2x + 1"); 
    resultados = Ecuaciones.ecuacion2Grado(1, -2, 1);
 
    if (resultados == null) {
        System.out.println("No tiene solucion");
    } else {
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }
    }
 
    System.out.println("x^2 - x + 1"); 
    resultados = Ecuaciones.ecuacion2Grado(1, 1, 1);
 
    if (resultados == null) {
        System.out.println("No tiene solucion");
    } else {
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }
    }
 
}
    }
