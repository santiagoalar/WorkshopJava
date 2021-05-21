//5)Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un
//bucle while.
package package1;

import java.util.function.IntPredicate;

public class FifthChallenge {
    public static void main(String[] args) {
        int number = 1;

        while (number<=100){
            if (condition(number)) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
            number++;
        }
    }

    public static boolean condition(int number){
        IntPredicate isEven = x-> x%2 ==0;
        return isEven.test(number);
    }
}
