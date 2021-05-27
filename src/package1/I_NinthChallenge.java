// 9)Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza
//todas las a del String anterior por una e, adicionalmente concatenar a esta
//frase una adicional que ustedes quieran incluir por consola y las muestre
//luego unidas.
package package1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class I_NinthChallenge {
    public static void main(String[] args) {
        String phrase = " La sonrisa sera la mejor arma contra la tristeza";
        String newText = phrase.replace('a','e');
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter a phrase in order to concatenate to saved phrase in our system: ");
        String phraseToPrint = entry.nextLine();
        System.out.println(newText + " " + phraseToPrint);
    }
}
