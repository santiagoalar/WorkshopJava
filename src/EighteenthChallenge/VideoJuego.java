package EighteenthChallenge;

public class VideoJuego implements Entregable {
    //•	Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    //•	Por defecto, las horas estimadas serán de 10 horas y entregado false.
    // El resto de atributos serán valores por defecto según el tipo del atributo.
    //Attributes
    private String titulos = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    //•	Los constructores que se implementaran serán:
    //•	Un constructor por defecto.
    //•	Un constructor con el titulo y horas estimadas. El resto por defecto.
    //•	Un constructor con todos los atributos, excepto de entregado.

    public VideoJuego(){

    }

    public VideoJuego(String titulos, int horasEstimadas) {
        this.titulos = titulos;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulos, int horasEstimadas, String genero, String compania) {
        this.titulos = titulos;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    //•	Los métodos que se implementara serán:
    //•	Métodos get de todos los atributos, excepto de entregado.
    //•	Métodos set de todos los atributos, excepto de entregado.
    //•	Sobrescribe los métodos toString.



    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulos='" + titulos + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado(){
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        return 0;
    }
}
