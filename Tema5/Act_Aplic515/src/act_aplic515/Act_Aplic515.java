package act_aplic515;
import java.util.Scanner;

public class Act_Aplic515 {

    public static void leeTablaAlumnos(int[][] tabla) {
        Scanner sc = new Scanner(System.in);
        for (int indice1 = 0; indice1 < tabla.length; indice1++) {
            for (int indice2 = 0; indice2 < tabla[0].length; indice2++) {
                System.out.println("Inserte nota numero: " + (indice2 + 1) + " del alumno numero " + (indice1 + 1));
                tabla[indice1][indice2] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        int[][] tablaNotas = new int[5][3];
        Scanner sc = new Scanner(System.in);
        leeTablaAlumnos(tablaNotas);

        System.out.println("Las medias son:");
        float media;
        for (int indice1 = 0; indice1 < tablaNotas[0].length; indice1++) {
            media = 0;
            for (int indice2 = 0; indice2 < tablaNotas.length; indice2++) {
                media += tablaNotas[indice2][indice1];
            }
            System.out.println("La media del curso en el " + (indice1 + 1) + "º trimestre es: " + media / 5.0);
        }

        System.out.println("De que alumno quieres saber la media?");
        int alumno = sc.nextInt();
        media = 0;
        for (int indice = 0; indice < tablaNotas[0].length; indice++) {
            media += tablaNotas[alumno][indice];
        }
        System.out.println("La media del alumno " + alumno + " es " + media / 3);

    }

}
