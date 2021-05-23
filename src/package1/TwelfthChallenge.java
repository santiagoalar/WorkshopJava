//12) Pedir dos palabras por teclado, indicar si son iguales, sino son
//iguales mostrar sus diferencias.
package package1;

import java.util.Locale;
import java.util.Scanner;

public class TwelfthChallenge {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Please, enter any word");
        String word1 = entry.next();
        System.out.println("enter another word");
        String word2 = entry.next();
        compareWords(word1, word2);
    }

    private static void compareWords(String word1, String word2){

        if (word1.equalsIgnoreCase(word2)){
            System.out.println("Both words are the same!");
        }else{
            System.out.println("Both words are different because: ");
            checkLength(word1, word2);
            checkFirstLetter(word1,word2);
            checkLastLetter(word1,word2);
        }
    }

    private static void checkLength(String word1, String word2){
        int wordLenght1 = word1.length();
        int wordLenght2 = word2.length();
        if (wordLenght1 != wordLenght2){
            System.out.println("Both words has different length");
        }
    }

    private static void checkFirstLetter(String word1, String word2){
        if(word1.charAt(0) != word2.charAt(0)){
            System.out.println("First word starts with " + word1.charAt(0) + ", but the second word starts with " + word2.charAt(0));
        }
    }

    private static void checkLastLetter(String word1, String word2){
        int wordLenght1 = word1.length();
        int wordLenght2 = word2.length();
        if (wordLenght1 != wordLenght2){
            System.out.println("Both words has different length");
        }
    }
}
