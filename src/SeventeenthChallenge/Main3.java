package SeventeenthChallenge;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int totalPriceTele;
        int totalPriceLavadora;
        int totalPriceElectro;

        //Tiene que ser un array de 10 posiciones
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico(100, "negro", 'A', 100);
        electrodomesticos[1] = new Electrodomestico(100, "azul", 'B', 10);
        electrodomesticos[2] = new Electrodomestico(100, "blanco", 'C', 20);
        electrodomesticos[3] = new Lavadora(100, "gris", 'D', 30, 25);
        electrodomesticos[4] = new Lavadora(100, "negro", 'E', 80, 32);
        electrodomesticos[5] = new Lavadora(100, "rojo", 'F', 20, 50);
        electrodomesticos[6] = new Television(100, "blanco", 'A', 10, 60, false);
        electrodomesticos[7] = new Television(100, "negro", 'B', 30, 30, true);
        electrodomesticos[8] = new Television(100, "rojo", 'C', 60, 30, false);
        electrodomesticos[9] = new Television(100, "azul", 'A', 70, 40, true);

        totalPriceTele = getTotalPriceTelevision(electrodomesticos);
        totalPriceLavadora = getTotalPriceLavadora(electrodomesticos);
        totalPriceElectro = getTotalPriceElectro(electrodomesticos);

        showTotals(totalPriceTele,totalPriceLavadora,totalPriceElectro);

    }

    private static Integer getTotalPriceElectro(Electrodomestico[] electrodomesticos) {
        return Arrays.stream(electrodomesticos).filter(x -> x instanceof Electrodomestico).map(Electrodomestico::precioFinal).reduce(0, Integer::sum);
    }

    private static Integer getTotalPriceLavadora(Electrodomestico[] electrodomesticos) {
        return Arrays.stream(electrodomesticos).filter(x -> x instanceof Lavadora).map(Electrodomestico::precioFinal).reduce(0, Integer::sum);
    }

    private static Integer getTotalPriceTelevision(Electrodomestico[] electrodomesticos) {
        return Arrays.stream(electrodomesticos).filter(x -> x instanceof Television).map(Electrodomestico::precioFinal).reduce(0, Integer::sum);
    }

    private static void showTotals(int totalPriceTele,int totalPriceLavadora, int totalPriceElectro){
        int totalPrice = totalPriceTele + totalPriceLavadora + totalPriceElectro;
        System.out.println("El precio total por los televisiores es: " + totalPriceTele);
        System.out.println("El precio total por las lavadoras es: " + totalPriceLavadora);
        System.out.println("El precio total por otros electrodomésticos es: " + totalPriceElectro);
        System.out.println("El total es: " + totalPrice);
    }

}
