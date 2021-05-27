//4) Crear un programa que pida un numero por teclado y que imprima por
// pantalla los números desde el numero introducido hasta 1000 con saltos de 2 en 2.
package package1;

import java.util.Scanner;

public class N_FourteenthChallenge {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = entry.nextInt();
        if (number>100){
            System.out.println("number too long");
        }else{
            printNumbers(number);
        }
    }

    public static void printNumbers(int number){
        for (int i = number; i < 100; i += 2) {
            System.out.println(i);
        }
    }
}
