package EighteenthChallenge;

public class Serie implements Entregable{

    //Attributes
    private String titulo = "";
    private int numTemp = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

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
