//Pide por teclado el nombre, la edad, sexo, peso y altura.
//Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables
//pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la
//altura y el último por defecto, para este último utiliza los métodos set para darle a
//los atributos un valor.
//Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
//Indicar para cada objeto si es mayor de edad.
//Por último, mostrar la información de cada objeto.

package SixteenthChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Bienvenido!! \nIngrese su nombre: ");
        String name = entry.nextLine();
        System.out.println("Ingrese su edad: ");
        int age = entry.nextInt();
        System.out.println("Ingrese su genero(H/M): ");
        String genreString = entry.nextLine();
        char genre = genreString.charAt(0);
        System.out.println("Ingrese su peso(Kg): ");
        double weight = entry.nextDouble();
        System.out.println("Ingrese su altura(Kg): ");
        double height = entry.nextDouble();
    }
}
