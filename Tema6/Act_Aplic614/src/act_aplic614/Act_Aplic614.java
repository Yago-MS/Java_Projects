package act_aplic614;

import java.util.Arrays;
import java.util.Scanner;


public class Act_Aplic614 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   char opcion;
   String contactos = "";
   do{
        System.out.println("Que quieres hacer? (A) añadir un nuevo contacto"
                + "B) buscar un telefono via nombre "
                + "C) mostrar los contactos ordenados por nombres"
                + "S) salir");
        
        opcion = sc.nextLine().charAt(0);
        
        switch (opcion){
        
            case 'A' ->{
                System.out.println("Inserte nombre");
                String nombre = sc.nextLine();
                System.out.println("Inserte numero");
                String numero = sc.nextLine();
                
                contactos += nombre + ":" + numero + " ";
                System.out.println(contactos);
        }
            case 'B' ->{
                System.out.println("¿A quién buscas?");
                String nombre = sc.nextLine();
                
                int indice = contactos.indexOf(nombre);
                
                System.out.println(indice);
                if(indice>=0)
                while(indice<(contactos.indexOf(nombre) + nombre.length() + 10)){
                    System.out.print(contactos.charAt(indice));
                indice++;
                }
                else
                    System.out.println("No se ha encontrado, ¿lo has escrito bien?");
                System.out.println("");
            }
            case 'C' ->{
                int totalContactos=0;
                
                for (int i = 0; i < contactos.length(); i++) {
                    if(contactos.charAt(i)==' '){
                    totalContactos++;
                    }
                }
                    if(totalContactos>0){
                    String[] grupoContactos = new String[totalContactos];
                    int indice=0;
                        for (int j = 0; j < grupoContactos.length; j++) {
                            String contactoActual = "";
                            
                            while(indice<contactos.length()&& contactos.charAt(indice)!=' '){
                            contactoActual += contactos.charAt(indice);
                            indice++;
                            }
                            indice++;
                            grupoContactos[j] = contactoActual;
                            
                        }
                        Arrays.sort(grupoContactos);
                        
                        System.out.println("Los contactos son:");
                        
                        for (int j = 0; j < grupoContactos.length; j++) {
                            System.out.println(grupoContactos[j]);
                            
                        }
                    
                    }
                
            }
            default -> {
                System.out.println("vuelve a intentarlo, por favor");
            }
        }
    }while(opcion!='S');
   
   }

}
