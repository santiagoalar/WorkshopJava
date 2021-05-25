//11) Realizar la construcción de un algoritmo que permita de acuerdo a una
//frase pasada por consola, indicar cual es la longitud de esta frase,
//adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
package package1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EleventhChallenge {
    public static long countA;
    public static long countE;
    public static long countI;
    public static long countO;
    public static long countU;

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Please, enter a phrase: ");
        String phrase = entry.nextLine();
        phrase = phrase.toLowerCase();
        /*for (int i = 0; i < phrase.length(); i++) {
            checkVowels(phrase.charAt(i));
        }*/
        List<Character> chars = convertStringToCharList(phrase);
        checkVowels2(chars);
        displayResults(phrase);
    }

    private static void displayResults(String phrase) {
        System.out.println("The length of the entered phrase is: " + phrase.length());
        System.out.println("a total: " + countA + "\ne total: " + countE + "\ni total: " + countI + "\no total: " + countO + "\nu total: " + countU);
    }

    /*public static void checkVowels(char char1) {
        switch (char1) {
            case 'a':
                countA++;
                break;
            case 'e':
                countE++;
                break;
            case 'i':
                countI++;
                break;
            case 'o':
                countO++;
                break;
            case 'u':
                countU++;
                break;
        }
    }*/

    public static List<Character> convertStringToCharList(String str) {
        //List<Character> chars = str.chars().mapToObj(e -> (char) e) collect(Collectors.toList());
        // Create an empty List of character
        List<Character> chars = str
                // Convert to String to IntStream
                .chars()
                // Convert IntStream to Stream<Character>
                .mapToObj(e -> (char) e)
                // Collect the elements as a List Of Characters
                .collect(Collectors.toList());
        // return the List
        return chars;
    }

    public static void checkVowels2(List<Character> lista){
        countA = lista.stream().filter(x -> x.equals('a')).count();
        countE = lista.stream().filter(x -> x.equals('e')).count();
        countI = lista.stream().filter(x -> x.equals('i')).count();
        countO = lista.stream().filter(x -> x.equals('o')).count();
        countU = lista.stream().filter(x -> x.equals('u')).count();
    }

}
