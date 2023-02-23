//Por YAGO
package act_aplic714;

public class Cambio {

private double cambio;
    
    public Cambio(double precio, double pagado) {
        cambio = pagado - precio;
    }

    public void billtes() {
        int quinientos=0, doscientos=0, cien=0, cincuenta=0, veinte=0, diez=0, cinco=0;

        while (cambio - 500 >=0){
            quinientos++;
            cambio = cambio-500;
        }
        while (cambio - 200 >= 0){
            doscientos++;
            cambio = cambio-200;
        }
        while (cambio - 100 >= 0){
            cien++;
            cambio = cambio-100;
        }
        while (cambio - 50 >= 0){
            cincuenta++;
            cambio = cambio-50;
        }
        while (cambio - 20 >= 0){
            veinte++;
            cambio = cambio-20;
        }
        while (cambio - 10 >= 0){
            diez++;
            cambio = cambio - 10;
        }
        while (cambio - 5 >= 0){
            cinco++;
            cambio = cambio - 5;
        }
        System.out.println("deben devolverse " + quinientos + " billetes de quinientos " + cien + " billetes de cien "+ cincuenta + " billetes de cincuenta " + veinte + "billetes de veinte" +  diez +  " billetes de diez " + cinco + " billetes de cinco");
    }
    public void monedas() {
        int euro2=0, euro1=0, cincuenta=0, veinte=0, diez=0, cinco=0, dos=0, uno=0;

        while (cambio - 2 >= 0){
            euro2++;
            cambio = cambio-2;
        }
        while (cambio - 1 >= 0){
            euro1++;
            cambio = cambio-1;
        }
        while (cambio - 0.50 >= 0){
            cincuenta++;
            cambio = cambio-0.50;
        }
        while (cambio - 0.20 >= 0){
            veinte++;
            cambio = cambio-0.20;
        }
        while (cambio - 0.10 >= 0){
            diez++;
            cambio = cambio - 0.10;
        }
        while (cambio - 0.05 >= 0){
            cinco++;
            cambio = cambio - 0.05;
        }
        while (cambio - 0.02 >= 0){
            dos++;
            cambio = cambio -0.02;
        }
        while (cambio - 0.01 >= 0){
            uno++;
            cambio = cambio - 0.01;
        }
        System.out.println("deben devolverse " + euro2 + " monedas de 2 euros " + euro1 + " monedas de 1 euro " + cincuenta + " monedas de cincuenta centimos " + veinte +  " monedas de veinte centimos " + diez + " monedas de diez centimos " + cinco + " monedas de cinco centimos " + dos + " monedas de dos centimos" + uno + " monedas de un centimo");
    }
}
