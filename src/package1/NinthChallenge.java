// 9)Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza
//todas las a del String anterior por una e, adicionalmente concatenar a esta
//frase una adicional que ustedes quieran incluir por consola y las muestre
//luego unidas.
package package1;

import java.util.Scanner;

public class NinthChallenge {
    public static void main(String[] args) {
        final String PHRASE = " La sonrisa sera la mejor arma contra la tristeza";
        String newPhrase = "";
        for (int i = 0; i < PHRASE.length(); i++) {
            if (PHRASE.charAt(i) == 'a') {
                newPhrase += "e";
            }else {
                newPhrase += PHRASE.charAt(i);
            }
        }
        concatenateNewPhrase(newPhrase);
    }

    public static void concatenateNewPhrase(String phraseWithE){
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter a phrase in order to concatenate to saved phrase in our system: ");
        String phraseToPrint = entry.nextLine();
        System.out.println(phraseToPrint.concat(phraseWithE));
    }
}
