package SeventeenthChallenge;

public class Television extends Electrodomestico {

    private double resolution = 20;
    private boolean hasTdt = false;

    //Constructors
    public Television() {
        super();
    }

    public Television(int precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(int precioBase, String color, char consumeEner, double peso, double resolution, boolean hasTdt) {
        super(precioBase, color, consumeEner, peso);
        this.resolution = resolution;
        this.hasTdt = hasTdt;
    }

    @Override
    public int precioFinal() {
        return super.precioFinal() + increaseDueResolution(this.resolution, this.precioBase) + increaseDueTDT(hasTdt);
    }

    private static int increaseDueResolution(double resolution, int precioBase){
         return (resolution>40)? (int) (precioBase * 0.3) :0;
    }

    private static int increaseDueTDT(boolean hasTdt){
        return (hasTdt)?50:0;
    }

    public double getResolution() {
        return resolution;
    }

    public boolean isHasTdt() {
        return hasTdt;
    }
}
