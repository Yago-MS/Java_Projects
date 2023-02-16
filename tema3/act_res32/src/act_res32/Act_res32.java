package act_res32;

import java.util.Scanner;


public class Act_res32 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, sumEdad=0, totAlum = 0, mayEdad = 0;
        
        System.out.println("Introduzca la edad");
        edad = sc.nextInt();
        
        while (edad > 0){
        
            sumEdad = sumEdad + edad;
            totAlum++;
            if (edad >= 18) {
            mayEdad++;
            }
            System.out.println("Introduzca la edad");
            edad = sc.nextInt();
        }
            
        System.out.println("La suma de todas las edades es:" + sumEdad);
        System.out.println("La media de las edades es:" + (sumEdad / totAlum));
        System.out.println("El numero de alumnos es: " + totAlum);
        System.out.println("Los alumnos mayores de edad son: " + mayEdad);
    }
    
}
