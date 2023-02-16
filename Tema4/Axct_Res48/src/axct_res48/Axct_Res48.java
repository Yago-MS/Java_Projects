//por YAGO
package axct_res48;

import java.util.Scanner;


public class Axct_Res48 {

    public static int suma(int num1, int num2){
    int result = num1+num2;
    return result;
    }
    public static int resta(int num1, int num2){
    int result = num1-num2;
    return result;
    }
    public static int multiplicacion(int num1, int num2){
    int result = num1*num2;
    return result;
    }
    public static int division(int num1,int num2){
    int result = num1/num2;
    return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, elec, result;
        System.out.println("Inserte un numero");
        num1 = sc.nextInt();
        System.out.println("Inserte otro numero");
        num2 = sc.nextInt();
        
        System.out.println("suma, resta, multiplicación o división? (1,2,3,4)");
        elec = sc.nextInt();
        if (elec==1){
        result = suma(num1,num2);
            System.out.println("La suma es " + result);
        } else if (elec==2){
        result = resta(num1,num2);
            System.out.println("La rests es " + result);
        } else if (elec==3){
        result = multiplicacion(num1,num2);
            System.out.println("la multiplicación es " + result);
        }else if (elec==4){
        result = division(num1,num2);
            System.out.println("la división es " + result);
        }
    }

}
