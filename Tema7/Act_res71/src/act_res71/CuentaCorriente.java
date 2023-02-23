//Por YAGO

package act_res71;

class CuentaCorriente {
    private String DNI;
    private String nombreTitular;
    private double saldo;

    // Constructor
    public CuentaCorriente(String DNI, String nombreTitular) {
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {
        boolean sacar=true;
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            sacar = false;
        }
        return sacar;
    }

    // Método para ingresar dinero
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("DNI: " + DNI);
        System.out.println("Nombre del titular: " + nombreTitular);
        System.out.println("Saldo: " + saldo);
    }
}