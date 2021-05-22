//7)Lee un número por teclado y comprueba que este numero es mayor o igual que
//cero, si no lo es lo volverá a pedir (do while), después muestra ese número
//por consola.
package package1;

import java.util.Scanner;

public class SeventhChallenge {
    public static void main(String[] args) {
        int number;
        Scanner entry = new Scanner(System.in);

        do{
            System.out.println("Enter one number: ");
            number = entry.nextInt();
            System.out.println("The number entered was: " + number);
        }while (number<0);

    }
}
