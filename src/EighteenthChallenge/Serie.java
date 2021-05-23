package EighteenthChallenge;

public class Serie implements Entregable{
    //•	Sus atributos son título, numero de temporadas, entregado, género y creador.
    //•	Por defecto, el número de temporadas es de 3 temporadas y entregado false.
    // El resto de atributos serán valores por defecto según el tipo del atributo.

    //Attributes
    private String titulo = "";
    private int numTemp = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    //Constructors
    //•	Los constructores que se implementarán serán:
    //•	Un constructor por defecto.
    //•	Un constructor con el titulo y creador. El resto por defecto.
    //•	Un constructor con todos los atributos, excepto de entregado.

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, String creador, int numTemp, String genero) {
        this.titulo = titulo;
        this.numTemp = numTemp;
        this.genero = genero;
        this.creador = creador;
    }

    //•	Los métodos que se implementara serán:
    //•	Métodos get de todos los atributos, excepto de entregado.
    //•	Métodos set de todos los atributos, excepto de entregado.
    //•	Sobrescribe los métodos toString.


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemp() {
        return numTemp;
    }

    public void setNumTemp(int numTemp) {
        this.numTemp = numTemp;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemp=" + numTemp +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEntregado(){
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        int valueA = (int)a;
        int totalTempo = this.numTemp;
        int answer;
        if(valueA > totalTempo){
            answer = valueA;
        }else {
            answer=totalTempo;
        }
        return answer;
    }
}
