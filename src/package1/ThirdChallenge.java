// 3) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se
//pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
//Usa la constante PI y el método pow de Math.

package package1;

import java.util.Scanner;

public class ThirdChallenge {
    public void areaCircle(){
        String radiusString;
        double radiusDouble;
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter the radius ");
        radiusString = entry.nextLine();
        radiusDouble = Double.parseDouble(radiusString);
        System.out.println(radiusDouble*Math.PI);
    }

    public static void main(String[] args) {
        ThirdChallenge app = new ThirdChallenge();
        app.areaCircle();

    }

}
