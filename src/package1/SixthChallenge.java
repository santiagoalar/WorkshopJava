//6)Realiza el ejercicio anterior usando un ciclo for.
package package1;

import java.util.function.IntPredicate;

public class SixthChallenge {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (condition(i)) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }

    public static boolean condition(int number){
        IntPredicate isEven = x-> x%2 ==0;
        return isEven.test(number);
    }
}
