//por YAGO
package act_aplic414;


public class Act_Aplic414 {

    public static int segundos(int d, int h, int m){
    int s;
        h=h+(d*24);
        m=m+(h*60);
        s=m*60;
    return s;
    }
    public static void main(String[] args) {
        int d=12, h = 20, m=80;
        System.out.println("Suponiendo: D:12, H:20, m:80");
        System.out.println(segundos(d, h, m) + " segundos en total");
    }

}
