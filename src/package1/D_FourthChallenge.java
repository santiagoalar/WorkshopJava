//4)Lee un número por teclado que pida el precio de un producto (puede tener
//decimales) y calcule el precio final con IVA. El IVA sera una constante que
//sera del 21%.

package package1;

import java.util.Scanner;
import java.util.function.Function;

public class D_FourthChallenge {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter the price of your product ");
        double priceProduct = entry.nextDouble();

        Function<Double, Double> taxCalculator = x-> x*1.21;

        System.out.println("Final price is " + taxCalculator.apply(priceProduct));

    }
}
