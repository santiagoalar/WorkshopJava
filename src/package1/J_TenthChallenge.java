//10) Realizar una aplicación de consola, que al ingresar una frase por teclado
//elimine los espacios que esta contenga.
package package1;

import java.util.Scanner;

public class J_TenthChallenge {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter a phrase in order to remove white spaces: ");
        String phrase = entry.nextLine();
        String newPhrase = phrase.replaceAll(" ", "");
        System.out.println(newPhrase);
    }
}
