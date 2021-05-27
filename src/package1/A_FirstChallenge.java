//Declara 2 variables numéricas (con el valor que desees), he indica cual es
// mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores
// para comprobar que funciona.
package package1;

public class A_FirstChallenge {
    public static void main(String[] args) {
        int number1 = 23;
        byte number2 = 127;

        if(number1 > number2){
            System.out.println(number1 + " es mayor que " +number2);
        }else if(number1<number2){
            System.out.println(number1 + " es menor que " +number2);
        }else{
            System.out.println("Los dos números son iguales");
        }

    }
}
