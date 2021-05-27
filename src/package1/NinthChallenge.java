// 9)Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza
//todas las a del String anterior por una e, adicionalmente concatenar a esta
//frase una adicional que ustedes quieran incluir por consola y las muestre
//luego unidas.
package package1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NinthChallenge {
    public static void main(String[] args) {
        String phrase = " La sonrisa sera la mejor arma contra la tristeza";
        List<Character> listString = convertStringToCharList(phrase);
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter a phrase in order to concatenate to saved phrase in our system: ");
        String phraseToPrint = entry.nextLine();

        convertOnlyA(listString, phraseToPrint);

    }

    public static void convertOnlyA(List<Character> listString, String stringToConcatenate) {
        List<Character> newList = listString.stream().map(x -> (x == 'a') ? 'e' : x).collect(Collectors.toList());
        concatenateNewPhrase(stringToConcatenate, newList);
    }

    public static void concatenateNewPhrase(String phraseWithE, List<Character> newList) {
        newList.stream().forEach(System.out::print);
        System.out.print(" " + phraseWithE);
    }

    public static List<Character> convertStringToCharList(String str) {
        List<Character> chars = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        return chars;
    }
}
