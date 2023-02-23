//Por YAGO

package act_aplic715;

public class Calendario {
  
    
    private int año;
    private int mes;
    private int dia;
    
    public Calendario(int año, int mes, int dia){
     this.año = año;
     this.mes = mes;
     this.dia = dia;
    }
    public void incrementarDia() {
        if (getMes() == 1 || getMes() == 3 || getMes() == 5 || getMes() == 7 || getMes() == 8 || getMes() == 10 && getDia() == 31) {
            setMes(getMes() + 1);
            setDia(1);
        } else if (getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11 && getDia() == 30) {
            setMes(getMes() + 1);
            setDia(1);
        } else if (getMes() == 2 && getDia() == 28) {
            setMes(getMes() + 1);
            setDia(1);
        } else if (getMes() == 12 && getDia() == 31) {
            setMes(1);
            setDia(1);
            setAño(getAño() + 1);
        } else {
            setDia(getDia() + 1);
        }

    }

    public void incrementarMes() {
        if (getMes() == 12) {
            setMes(1);
            setAño(getAño() + 1);
        } else {
            setMes(getMes() + 1);
        }
    }
    public void incrementarAño(int numAño){
        setAño(getAño() + numAño);
    }
    public void mostrar(){
        System.out.println(getDia()+ "/" + getMes() + "/" + getAño());
    }
    public boolean iguales(Calendario fecha, Calendario otraFecha){
    boolean esIgual=false;
    
    if( fecha.getAño()==otraFecha.getAño()&&fecha.getMes()==otraFecha.getMes()&&fecha.getDia()==otraFecha.getDia()){
    esIgual=true;
    }
        return esIgual;
    }
    
    

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
}
