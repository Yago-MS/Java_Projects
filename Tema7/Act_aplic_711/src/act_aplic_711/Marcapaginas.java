//Por YAGO

package act_aplic_711;

public class Marcapaginas {

    private int pagina;
    
    public void getPagina(){
    
       this.pagina= pagina;
    }
    
    public void avanzarPagina() {
        this.pagina++;
    }

    public void reiniciarLectura() {
        this.pagina = 0;
    }
    
}
