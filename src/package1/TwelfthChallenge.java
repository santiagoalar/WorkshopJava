//12) Pedir dos palabras por teclado, indicar si son iguales, sino son
//iguales mostrar sus diferencias.
package package1;

import java.util.Scanner;

public class TwelfthChallenge {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Please, enter any word");
        String word1 = entry.next();
        System.out.println("enter another word");
        String word2 = entry.next();
        compareWords(word1, word2);
        //compareWords2(word1, word2); //Functional methods
    }

    private static void compareWords(String word1, String word2){
        if (word1.equalsIgnoreCase(word2)){
            System.out.println("Both words are the same!");
        }else{
            System.out.println("Both words are different because: ");
            checkLength(word1, word2);
            //checkFirstLetter(word1,word2);
            //checkLastLetter(word1,word2);
        }
    }

    private static void checkLength(String word1, String word2){
        int lengthWord1 = word1.length();
        int lengthWord2 = word2.length();
        int minLength = lengthWord1;
        int maxLength;
        if (lengthWord1>lengthWord2){
            minLength = lengthWord2;
            maxLength = lengthWord1;
            displayExtraCharacters(word1, minLength, maxLength);
        }else if (lengthWord1<lengthWord2){
            minLength = lengthWord1;
            maxLength = lengthWord2;
            displayExtraCharacters(word2, minLength, maxLength);
        }
        compareEachCharacter(word1,word2, minLength);
    }

    private static void compareEachCharacter(String word1, String word2, int minLength){
        for (int i = 0; i < minLength; i++) {
            if (word1.charAt(i) != word2.charAt(i)) System.out.println("Position " +
                    "" + i + " word1 has '" + word1.charAt(i) + "' and word2 has '" + word2.charAt(i)+"'" );
        }
    }

    private static void displayExtraCharacters(String longestWord, int minLength, int maxLength){
        System.out.println("They have different length");
        System.out.println("The longest word has characters that the shorter doesnt have as: ");
        for (int i = minLength; i <= maxLength -1; i++) {
            System.out.print(longestWord.charAt(i) + ", ");
        }
    }
}
