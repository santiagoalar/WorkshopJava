//11) Realizar la construcción de un algoritmo que permita de acuerdo a una
//frase pasada por consola, indicar cual es la longitud de esta frase,
//adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
package package1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EleventhChallenge {
    static long countA;
    static long countE;
    static long countI;
    static long countO;
    static long countU;

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Please, enter a phrase: ");
        String phrase = entry.nextLine();
        phrase = phrase.toLowerCase();

        List<Character> chars = convertStringToCharList(phrase);
        checkVowels2(chars);
        displayResults(phrase);
    }

    private static void displayResults(String phrase) {
        System.out.println("The length of the entered phrase is: " + phrase.length());
        System.out.println("a total: " + countA + "\ne total: " + countE + "\ni total: " + countI + "\no total: " + countO + "\nu total: " + countU);
    }

    public static List<Character> convertStringToCharList(String str) {
        return str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
    }

    public static void checkVowels2(List<Character> lista) {
        countA = lista.stream().filter(x -> x.equals('a')).count();
        countE = lista.stream().filter(x -> x.equals('e')).count();
        countI = lista.stream().filter(x -> x.equals('i')).count();
        countO = lista.stream().filter(x -> x.equals('o')).count();
        countU = lista.stream().filter(x -> x.equals('u')).count();
    }

}
