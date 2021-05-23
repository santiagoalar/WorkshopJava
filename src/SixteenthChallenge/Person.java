package SixteenthChallenge;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Person {
    //nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
    private String name = "";
    private byte age = 0;
    private int dni;
    private char genre = 'H';
    private double weight = 0;
    private double height = 0;
    private final String[] LETTERS = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    public Person() {
    }

    public Person(String name, byte age, char genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public Person(String name, byte age, int dni, char genre, float weight, float height) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.genre = genre;
        this.weight = weight;
        this.height = height;
    }

    //calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)),
    //si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un
    //número entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal la
    // función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
    // la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.

    public int calcularIMC(){
        int answer;
        double imcAnswer;
        imcAnswer = this.weight/(Math.pow(this.weight, 2));
        answer = checkImcAnswer(imcAnswer);
        return answer;
    }

    private static int checkImcAnswer(double imcAnswer){
        int answer = 1;
        if(imcAnswer<20){
            answer = -1;
        }else if(imcAnswer<25){
            answer = 0;
        }
        return answer;
    }

    //esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad(byte age){
        IntPredicate predicate = x -> x>18;
        return predicate.test(age);
    }

    //comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto,
    //sera H. No será visible al exterior.
    public boolean comprobarSexo(char genre){
        Predicate<Character> predicate = x -> x == this.genre;
        return  predicate.test(genre);
    }

    //generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su
    //letra correspondiente. Este método será invocado cuando se construya el objeto. Puedes
    //dividir el método para que te sea más fácil. No será visible al exterior.
    //Métodos set de cada parámetro, excepto de DNI.

    private String generaDNI(){
        String dni;
        int dniNumbers = (int) (Math.random()*100000000);
        dni = LETTERS[getFirstNumber(dniNumbers)] + String.valueOf(dniNumbers);
        return dni;
    }

    private int getFirstNumber(int dniNumbers){
        int numberForPosition =  dniNumbers/10000000;
        return numberForPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getDni() {
        return dni;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dni=" + dni +
                ", genre=" + genre +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
