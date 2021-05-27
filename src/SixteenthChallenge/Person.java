package SixteenthChallenge;

public class Person {
    //Attributes
    private String name = "";
    private byte age = 0;
    private String dni;
    private char genre = 'H';
    private double weight = 0;
    private double height = 0;
    private final String[] LETTERS = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E "};

    //Constructors
    public Person() {
        this.dni = generaDNI();
    }

    public Person(String name, byte age, char genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.dni = generaDNI();
    }

    public Person(String name, byte age, char genre, float weight, float height) {
        this.name = name;
        this.age = age;
        this.dni = generaDNI();
        this.genre = genre;
        this.weight = weight;
        this.height = height;
    }

    //Methods
    public int calcularIMC() {
        double imcAnswer = this.weight / (Math.pow(this.height, 2));
        int answer = checkImcAnswer(imcAnswer);
        return answer;
    }

    private static int checkImcAnswer(double imcAnswer) {
        int answer = (imcAnswer <= 20) ? -1 : 0;
        if (imcAnswer > 25) answer = 1;
        return answer;
    }

    public boolean esMayorDeEdad() {
        return this.age>=18;
    }

    private void comprobarSexo(char genre) {
        this.genre = (genre == 'H' || genre == 'M' )? 'H': genre;
    }

    private String generaDNI() {
        int dniNumbers = (int) (Math.random() * 99999999) + 1;
        return dniNumbers + "-" + getCharacterDNI(dniNumbers);
    }

    private String getCharacterDNI(int dniNumbers) {
        return LETTERS[dniNumbers % 23];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setGenre(char genre) {
        this.comprobarSexo(genre);
    }

    public void setWeight(float weight) {
        this.weight = weight;
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
