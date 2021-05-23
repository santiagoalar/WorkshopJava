package SeventeenthChallenge;

public class Electrodomestico {
    //Attributes
    int precioBase = 100;
    String color = "blanco"; //blancos, negro, rojo, azul y gris.
    char consumeEner = 'F'; //A o F
    double peso = 5;

    //el color será blanco, el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg.
    // Usa constantes para ello.

    //Constructors
    public Electrodomestico() {}

    public Electrodomestico(int precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumeEner, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumeEner = consumeEner;
        this.peso = peso;
        comprobarConsumoEnergetico(consumeEner);
    }

    //Methods
    //•	comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    // sino es correcta usara la letra por defecto. Se invocará al crear el objeto y no será visible.
    //•	comprobarColor(String color): comprueba que el color es correcto,
    // sino lo es usa el color por defecto. Se invocará al crear el objeto y no será visible.
    //•	precioFinal(): según el consumo energético, aumentara su precio,
    // y según su tamaño, también. Esta es la lista de precios:

    private void comprobarConsumoEnergetico(char letra){
        boolean answer = false;
        for (Consumo c : Consumo.values()) {
            if (c.name().equals(letra)) {
                answer = true;
            }
        }
        if(!answer){
            this.consumeEner = 'F';
        }
    }

    public void comprobarColor(String color){

        String colorEnter = this.color;
        //colo
    }

    public void precioFinal(){

    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumeEner() {
        return consumeEner;
    }

    public void setConsumeEner(char consumeEner) {
        this.consumeEner = consumeEner;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
