package SeventeenthChallenge;

import java.util.Arrays;

public class Electrodomestico {
    //Attributes
    protected int precioBase = 100;
    protected String color = "blanco"; //blancos, negro, rojo, azul y gris.
    protected char consumeEner = 'F'; //A o F
    protected double peso = 5;
    private String[] colors = {"blanco", "negro", "rojo", "azul", "gris"};

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
        comprobarColor(color);
    }

    //Methods
    //•	comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    // sino es correcta usara la letra por defecto. Se invocará al crear el objeto y no será visible.
    //•	comprobarColor(String color): comprueba que el color es correcto,
    // sino lo es usa el color por defecto. Se invocará al crear el objeto y no será visible.
    //•	precioFinal(): según el consumo energético, aumentara su precio,
    // y según su tamaño, también. Esta es la lista de precios:

    private void comprobarConsumoEnergetico(char letra){
        boolean answer = Arrays.stream(Consumo.values()).anyMatch(x -> x.name().equals(Character.toString(letra)));
        if(!answer){
            this.consumeEner = 'F';
        }
    }

    public void comprobarColor(String color){
        boolean answer = Arrays.stream(colors).anyMatch(x->x.equalsIgnoreCase(color));
        if(!answer){
            this.color = "blanco";
        }
    }

    public int precioFinal(){
        return this.precioBase + increaseDueConsume(this.consumeEner) + increaseDueWeight(this.peso);
    }

    private static int increaseDueConsume(char consumeEner){
        String typeConsume = String.valueOf(consumeEner);
        return Consumo.valueOf(typeConsume).getConsumo();
    }
    private static int increaseDueWeight(Double peso){
        int precio = 100;
        if(peso<19){
            precio = 10;
        }else if(peso<49){
            precio = 50;
        }else if(peso<79){
            precio = 80;
        }
        return precio;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumeEner() {
        return consumeEner;
    }

    public double getPeso() {
        return peso;
    }

}
