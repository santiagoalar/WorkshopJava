package SeventeenthChallenge;

public class Main3 {
    public static void main(String[] args) {

        Electrodomestico electrodomestico1 = new Lavadora(100, "negro",'A',100,35);
        int precioFinal = electrodomestico1.precioFinal();
        System.out.println(precioFinal);

        Electrodomestico electrodomestico2 = new Television(100, "azul", 'A', 10,50,true);
        int precioFinal2 = electrodomestico2.precioFinal();
        System.out.println(precioFinal2);
    }
}
