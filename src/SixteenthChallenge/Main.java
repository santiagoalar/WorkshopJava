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
        byte age = entry.nextByte();
        System.out.println("Ingrese su genero(H/M): ");
        String genreString = entry.nextLine();
        char genre = genreString.charAt(0);
        System.out.println("Ingrese su peso(Kg): ");
        float weight = entry.nextFloat();
        System.out.println("Ingrese su altura(Kg): ");
        float height = entry.nextFloat();

        Person person1 = new Person(name, age, genre, weight, height);

        Person person2 = new Person(name, age, genre);
        person2.setHeight(70);
        person2.setHeight(180);

        Person person3 = new Person();
        person3.setName("Andres");
        person3.setAge((byte) 20);
        person3.setGenre('H');
        person3.setWeight(80);
        person3.setHeight(171);

        
    }
}
