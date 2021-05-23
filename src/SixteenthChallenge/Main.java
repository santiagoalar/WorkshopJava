//Pide por teclado el nombre, la edad, sexo, peso y altura.
//Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables
//pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la
//altura y el último por defecto, para este último utiliza los métodos set para darle a
//los atributos un valor.
//Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
//Indicar para cada objeto si es mayor de edad.
//Por último, mostrar la información de cada objeto.

package SixteenthChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String name, genreString;
        float weight, height;
        byte age;
        char genre;

        System.out.println("Bienvenido!! \nIngrese su nombre: ");
        name = entry.nextLine();

        System.out.println("Ingrese su edad: ");
        age = (byte) entry.nextInt();

        System.out.println("Ingrese su genero(H/M): ");
        entry.nextLine();
        genreString = entry.nextLine();
        genre = genreString.charAt(0);

        System.out.println("Ingrese su peso(Kg): ");
        weight = entry.nextFloat();

        System.out.println("Ingrese su altura(m): ");
        height = entry.nextFloat();

        Person person1 = new Person(name, age, genre, weight, height);

        Person person2 = new Person(name, age, genre);
        person2.setWeight(70);
        person2.setHeight(1.80f);

        Person person3 = new Person();
        person3.setName("Andres");
        person3.setAge((byte) 20);
        person3.setGenre('H');
        person3.setWeight(80);
        person3.setHeight(1.71f);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        checkPeople(people);

    }

    //Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
//Indicar para cada objeto si es mayor de edad.
//Por último, mostrar la información de cada objeto.

    public static void hasIdealWeight(int imcAnswer){
        switch (imcAnswer){
            case -1:
                System.out.println("Está por de bajo de su peso ideal");
                break;
            case 0:
                System.out.println("Su peso es idea");
                break;
            case 1:
                System.out.println("Está en sobrepeso");
                break;
        }
    }

    public static void checkEsMayor(boolean age){
        if (age){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
    }

    public static void checkPeople(ArrayList<Person> people){
        for (Person person:people ) {
            System.out.println(person.getName() + ": ");
            hasIdealWeight(person.calcularIMC());
            checkEsMayor(person.esMayorDeEdad());
            System.out.println(person.toString()+"\n");
        }
    }
}
