package SeventeenthChallenge;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        int totalPriceTv = 0;
        int totalPriceLav = 0;
        int totalPriceElec = 0;
        int totalPrice = 0;
/*        Electrodomestico electrodomestico1 = new Lavadora(100, "negro",'A',100,35);
        int precioFinal = electrodomestico1.precioFinal();
        System.out.println(precioFinal);

        Electrodomestico electrodomestico2 = new Television(100, "azul", 'A', 10,50,true);
        int precioFinal2 = electrodomestico2.precioFinal();
        System.out.println(precioFinal2);*/

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);
        electrodomesticos.add(new Electrodomestico(100, "negro", 'A', 100));
        electrodomesticos.add(new Electrodomestico(100, "azul", 'B', 10));
        electrodomesticos.add(new Electrodomestico(100, "blanco", 'C', 20));
        electrodomesticos.add(new Lavadora(100, "gris", 'D', 30, 25));
        electrodomesticos.add(new Lavadora(100, "negro", 'E', 80, 32));
        electrodomesticos.add(new Lavadora(100, "rojo", 'F', 20, 50));
        electrodomesticos.add(new Television(100, "blanco", 'A', 10, 60, false));
        electrodomesticos.add(new Television(100, "negro", 'B', 30, 30, true));
        electrodomesticos.add(new Television(100, "rojo", 'C', 60, 30, false));
        electrodomesticos.add(new Television(100, "azul", 'A', 70, 40, true));

        for (Electrodomestico electro : electrodomesticos) {
            //System.out.println(electro.precioFinal());
            System.out.println("Precios de televisores");
            if (electro instanceof Television) {
                System.out.println(electro.precioFinal());
                totalPriceTv += electro.precioFinal();
            } else if (electro instanceof Lavadora) {
                totalPriceLav += electro.precioFinal();
            } else {
                totalPriceElec += electro.precioFinal();
            }
        }
        totalPrice = totalPriceElec + totalPriceTv + totalPriceLav;

        System.out.println("El precio total por los televisiores es: " + totalPriceTv);
        System.out.println("El precio total por las lavadoras es: " + totalPriceLav);
        System.out.println("El precio total por otros electrodomésticos es: " + totalPriceElec);
        System.out.println("El total es: " + totalPrice);

    }
}
