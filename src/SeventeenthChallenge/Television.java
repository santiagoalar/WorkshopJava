package SeventeenthChallenge;

import java.util.function.IntPredicate;

public class Television extends Electrodomestico {

    //•	Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
    //•	Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
    // Attributes
    private double resolution = 20;
    private boolean hasTdt = false;

    //•	Los constructores que se implementarán serán:
    //•	Un constructor por defecto.
    //•	Un constructor con el precio y peso. El resto por defecto.
    //•	Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
    // Recuerda que debes llamar al constructor de la clase padre.
    //Constructors

    public Television() {

    }

    public Television(int precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(int precioBase, String color, char consumeEner, double peso, double resolution, boolean hasTdt) {
        super(precioBase, color, consumeEner, peso);
        this.resolution = resolution;
        this.hasTdt = hasTdt;
    }

    //•	Los métodos que se implementara serán:
//•	Método get de resolución y sintonizador TDT.
//•	precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara
// el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €.
// Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.


    @Override
    public int precioFinal() {
        return super.precioFinal() + increaseDueResolution(this.resolution, this.precioBase) + increaseDueTDT(hasTdt);
    }

    public static int increaseDueResolution(double resolution, int preciobase){
         int precioExtra = (resolution>40)? (int) (preciobase * 0.3) :0;
        return precioExtra;
    }

    public static int increaseDueTDT(boolean hasTdt){
        int precioExtra = (hasTdt)?50:0;
        return precioExtra;
    }

    public double getResolution() {
        return resolution;
    }

    public boolean isHasTdt() {
        return hasTdt;
    }
}
