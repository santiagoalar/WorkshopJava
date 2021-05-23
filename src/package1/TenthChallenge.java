//10) Realizar una aplicación de consola, que al ingresar una frase por teclado
//elimine los espacios que esta contenga.
package package1;

import java.util.Scanner;

public class TenthChallenge {

/*    public interface Operacion1 {
        Boolean convert(String char1, String char2);
    }*/

    public interface Operacion1 {
        Boolean convert(char string);
    }

    public static void main(String[] args) {
        //String newPhrase = phrase.replaceAll("\\s+","");
        //String phrase = "lorem ipsum dolor sit amet consectetur adipiscing elit";
        Scanner entry = new Scanner(System.in);

        System.out.println("Enter a phrase in order to remove white spaces: ");

        String phrase = entry.nextLine();
        Operacion1 operacion1 = x->x == ' ';
        String newPhrase = replaceWhiteSpaces(phrase,operacion1);
        System.out.println(newPhrase);
    }

    public  static String replaceWhiteSpaces(String text, Operacion1 op){
        String text2 = "";
        char letra;
        for (int i = 0; i < text.length(); i++) {
            letra = text.charAt(i);
            if(!op.convert(letra)) {
                text2+=letra;
            }
        }
        return text2;
    }
}
