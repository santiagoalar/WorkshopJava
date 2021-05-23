//11) Realizar la construcción de un algoritmo que permita de acuerdo a una
//frase pasada por consola, indicar cual es la longitud de esta frase,
//adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
package package1;

import java.util.Scanner;

public class EleventhChallenge {
    public static int countA;
    public static int countE;
    public static int countI;
    public static int countO;
    public static int countU;

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Please, enter a phrase: ");
        String phrase = entry.nextLine();
        phrase = phrase.toLowerCase();
        for (int i = 0; i < phrase.length(); i++) {
            checkVowels(phrase.charAt(i));
        }
        displayResults(phrase);
    }

    private static void displayResults(String phrase){
        System.out.println("The length of the entered phrase is: " + phrase.length());
        System.out.println("a total: " + countA + "\ne total: " + countE + "\ni total: " + countI + "\no total: " + countO + "\nu total: " + countU);
    }

    public static void checkVowels(char char1){
        switch (char1){
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
    }
}
