//Por YAGO

package act_res75;

public class Gestor {
    private String nombre;
    private final String telefono;
    private int importeMaximo;
    
    //constructor
    
    public Gestor(String nombre, String telefono, int importeMaximo){
    this.nombre = nombre;
    this.telefono = telefono;
    this.importeMaximo = importeMaximo;
    }
    public Gestor(String nombre, String telefono){
    this.nombre = nombre;
    this.telefono = telefono;
    this.importeMaximo = 10000;
    }
}
