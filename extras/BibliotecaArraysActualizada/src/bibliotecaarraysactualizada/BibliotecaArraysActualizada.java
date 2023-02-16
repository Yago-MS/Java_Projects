//por YAGO
package bibliotecaarraysactualizada;

import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaArraysActualizada {
    public static void leeArray(int[] tabla){
    Scanner sc = new Scanner(System.in);
    for(int indice=0;indice<tabla.length;indice++){
        System.out.println("Inserte parametro" + "(" + indice + ")");
        tabla[indice] = sc.nextInt();
    }
    }
    public static void mostrarArray(int[] tabla) {
        for (int indice = 0; indice < tabla.length; indice++) {
            System.out.print(tabla[indice] + " ");
        }
    }
    public static int[] copia(int[] tabla, int longitud) {
        int[] copiada = new int[longitud];

        for (int indice = 0; indice < tabla.length && indice < longitud; indice++) {
            copiada[indice] = tabla[indice];
        }

        return copiada;
    }
    public static int busquedaInversa(int[] tabla, int parametro){
    int posicion= -1;
        
    for(int indice=tabla.length-1;indice >= 0 ;indice--){
    
        if(tabla[indice]==parametro){
        posicion = indice;
        }
    }
    
    return posicion;
    }
    public static int busquedaInversaMayores(int[] tabla, int parametro){
    int posicion= -1;
        
    for(int indice=tabla.length-1;indice >= 0 ;indice--){
    
        if(tabla[indice]>parametro){
        posicion = indice;
        }
    }
    
    return posicion;
    }
    public static int busqueda(int[] tabla, int parametro){
    int posicion= -1;
        
    for(int indice=0;indice < tabla.length ;indice++){
    
        if(tabla[indice]==parametro){
        posicion = indice;
        }
    }
    
    return posicion;
    }
    public static int busquedaMayores(int[] tabla, int parametro){
    int posicion= -1;
        
    for(int indice=0;indice < tabla.length;indice++){
        
        if(tabla[indice]>parametro){
        System.out.println("indice:" + tabla[indice]);
        posicion = indice;
        }
    }
    return posicion;
    }
    public static int[] copiaRango(int[] tabla, int desde, int hasta) {

        if (desde > hasta) {
            int aux = desde;
            desde = hasta;
            hasta = aux;
        }
        int[] copia = new int[hasta - desde];

        for (int indice = desde, indice2 = 0; indice < hasta; indice++, indice2++) {
            copia[indice2] = tabla[indice];
        }

        return copia;
    }
    public static void copiaTabla(int[] tablaOrigen, int posOrigen, int[] tablaDestino, int posDestino, int longitud) {

        for (int indice = 0; indice < longitud; indice++) {
            tablaDestino[posDestino + indice] = tablaOrigen[posOrigen + indice];
        }

    }
    public static int[] insercionNoOrdenada(int[] tabla, int elemento) {
       int [] resultado;
        resultado = copia(tabla, tabla.length + 1);
        resultado[resultado.length - 1] = elemento;
        
        return resultado;
    }
    public static int[] insercionOrdenada(int[] tabla, int num){
    int indiceInsercion = Arrays.binarySearch(tabla, num); 
    if(indiceInsercion<0){
    indiceInsercion = -indiceInsercion -1;
    
    }
    int [] copia = new int[tabla.length +1];
    copiaTabla(tabla, 0, copia, 0 , indiceInsercion);
    copiaTabla(tabla, indiceInsercion, copia, indiceInsercion+1, tabla.length-indiceInsercion);
    copia[indiceInsercion] = num;
    tabla= copia;
    return tabla;
    }
    public static int[] eliminacionNoOrdenada(int[] tabla, int parametro){
    int[] copia = new int[tabla.length -1];
    int indiceInsercion;
    indiceInsercion = busqueda(tabla, parametro);
    copia = copia(tabla, tabla.length-1);
        if (indiceInsercion > 0) {
            copia[indiceInsercion] = tabla[tabla.length - 1];
        }

        return copia;
    }
    public static int[] eliminarMayores(int[] tabla, int valor){
    int indice;
       do{
        indice = busquedaMayores(tabla, valor);
        tabla = eliminacionNoOrdenada(tabla, valor);
       }while(indice>=0);
        return tabla;
        
    }
    public static int[] eliminarOrdenada(int[] tabla, int parametro) {
        int indiceBorrado = Arrays.binarySearch(tabla, parametro);

        if (indiceBorrado >= 0) {
            while (indiceBorrado < tabla.length - 1) {
                
                tabla[indiceBorrado] = tabla[indiceBorrado+1];
                indiceBorrado++;
                
            }
        }
        int[] copia = copia(tabla, tabla.length - 1);

        return copia;
    }
    public static boolean iguales(int[] t1, int[] t2){
        boolean iguales = true;

        if (t1.length == t2.length) {

            for (int indice = 0; indice < t1.length; indice++) {
                if (t1[indice] != t2[indice]) {
                    iguales = false;
                }
            }
        } else {
            iguales = false;
        }

        return iguales;
    }
    public static void leeTabla2D(int[][] tabla) {
        Scanner sc = new Scanner(System.in);
        for (int indice1 = 0; indice1 < tabla.length; indice1++) {
            for (int indice2 = 0; indice2 < tabla[0].length; indice2++) {
                System.out.println("inserte " + indice1 + " " + indice2);
                tabla[indice1][indice2] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablaOriginal = {1,2,3,4,5,6,7,8};
        mostrarArray(tablaOriginal);
        System.out.println("Inserta nuevo parametro a eliminar");
        int parametro = sc.nextInt();
        tablaOriginal = eliminarOrdenada(tablaOriginal, parametro);
        mostrarArray(tablaOriginal);
    }

}
