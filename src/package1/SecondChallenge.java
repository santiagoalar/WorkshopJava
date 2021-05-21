//Al ejercicio anterior agregar entrada por consola de dos valores e indicar
// si son mayores, menores o iguales.
package package1;

import java.util.Scanner;

public class SecondChallenge {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner entry = new Scanner(System.in);
        number1 = entry.nextInt();
        number2 =  entry.nextInt();

        if(number1 > number2){
            System.out.println(number1 + " es mayor que " +number2);
        }else if(number1<number2){
            System.out.println(number1 + " es menor que " +number2);
        }else{
            System.out.println("Los dos números son iguales");
        }


    }
}
