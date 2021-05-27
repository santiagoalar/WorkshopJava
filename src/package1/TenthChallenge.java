//10) Realizar una aplicación de consola, que al ingresar una frase por teclado
//elimine los espacios que esta contenga.
package package1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TenthChallenge {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter a phrase in order to remove white spaces: ");
        String phrase = entry.nextLine();

        replaceWhiteSpaces(phrase);
    }

    public  static void replaceWhiteSpaces(String text){
        List<Character> newText = convertStringToCharList(text);
        newText.stream().filter(x->x != ' ').forEach(System.out::print);
    }

    public static List<Character> convertStringToCharList(String str) {
        return str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
    }
}
