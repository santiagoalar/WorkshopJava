package EighteenthChallenge;

public class VideoJuego implements Entregable {
    //Attributes
    private String titulos = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    //Constructor
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

    //Methods
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
        VideoJuego videoJuego = (VideoJuego) a;
        int answer = 0;
        if (this.horasEstimadas > videoJuego.getHorasEstimadas()){
            answer = 1;
        }else if(this.horasEstimadas < videoJuego.getHorasEstimadas()){
            answer = -1;
        }
        return answer;
    }
}
