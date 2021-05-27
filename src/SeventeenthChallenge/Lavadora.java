package SeventeenthChallenge;

public class Lavadora extends Electrodomestico {

    //Attributes
    private double carga = 5;

    //Constructor
    public Lavadora() {
        super();
    }

    public Lavadora(int precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(int precioBase, String color, char consumeEner, double peso, double carga) {
        super(precioBase, color, consumeEner, peso);
        this.carga = carga;
    }

    //Methods
    public double getCarga() {
        return carga;
    }

    @Override
    public int precioFinal() {
        int precioAddition = (this.carga > 30)?50:0;
        return super.precioFinal() + precioAddition;
    }
}
