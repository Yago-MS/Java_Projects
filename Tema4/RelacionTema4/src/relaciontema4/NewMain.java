package relaciontema4;




import static relaciontema4.NewClass.esPrimo;

//por YAGO

public class NewMain {

    
    public static void main(String[] args) {
       
        
        for (int cont=1;cont<=1000;cont++){
       if (esPrimo(cont))
                System.out.println(cont);
       }
    }

}
