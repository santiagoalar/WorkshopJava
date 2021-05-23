package SeventeenthChallenge;

public class Lavadora extends Electrodomestico {

    //•	Los constructores que se implementarán serán:
    //•	Un constructor por defecto.
    //•	Un constructor con el precio y peso. El resto por defecto.
    //•	Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor
    // de la clase padre.

    //Attributes
    private double carga = 5;

    public Lavadora() {

    }

    public Lavadora(int precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(int precioBase, String color, char consumeEner, double peso, double carga) {
        super(precioBase, color, consumeEner, peso);
        this.carga = carga;
    }

    //Methods
    //•	Método get de carga.
    //•	precioFinal():, si tiene una carga mayor de 30 kg, aumentara el
    // precio 50 €, sino es así no se incrementara el precio. Llama al
    // método padre y añade el código necesario. Recuerda que las condiciones
    // que hemos visto en la clase Electrodomestico también deben afectar al precio.

    public double getCarga() {
        return carga;
    }

    @Override
    public int precioFinal() {
        int precioAddition = 0;
        if (this.carga > 30) {
            precioAddition = 50;
        }
        return super.precioFinal() + precioAddition;
    }
}
