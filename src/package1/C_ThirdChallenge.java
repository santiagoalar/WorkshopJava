// 3) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se
//pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
//Usa la constante PI y el método pow de Math.

package package1;

import java.util.Scanner;

public class C_ThirdChallenge {
    public void areaCircle(Double radius) {
        System.out.println(radius * Math.PI);
    }

    public static void main(String[] args) {
        double radius;
        C_ThirdChallenge app = new C_ThirdChallenge();
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter the radius ");

        radius = entry.nextDouble();
        app.areaCircle(radius);
    }

}
