//Por YAGO

package act_res73;

class CuentaCorriente {
    private String DNI;
    private String nombreTitular;
    private double saldo;

    // Constructores
    public CuentaCorriente(String DNI, String nombreTitular) {
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }
    public CuentaCorriente(String DNI, double saldo) {
        this.DNI = DNI;
        this.nombreTitular = null;
        this.saldo = saldo;
    }
        public CuentaCorriente(String DNI, String nombreTitular, double saldo) {
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }
    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {
        boolean sacar=true;
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
        } else {
            sacar = false;
        }
        return sacar;
    }

    // Método para ingresar dinero
    public void ingresarDinero(double cantidad) {
        setSaldo(getSaldo() + cantidad);
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("DNI: " + getDNI());
        System.out.println("Nombre del titular: " + getNombreTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    /**
     * @return the DNI
     */
    private String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    private void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the nombreTitular
     */
    private String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * @param nombreTitular the nombreTitular to set
     */
    private void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    /**
     * @return the saldo
     */
    private double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}