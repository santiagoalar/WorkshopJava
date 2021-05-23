package EighteenthChallenge;

import java.util.Arrays;
import java.util.Comparator;

public class Main4 {
    public static void main(String[] args) {
        //•	Crea dos arrays, uno de Series y otro de Videojuegos,
        // de 5 posiciones cada uno.
        //•	Crea un objeto en cada posición del array, con los valores que
        // desees, puedes usar distintos constructores.
        //•	Entrega algunos Videojuegos y Series con el método entregar().
        //•	Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
        //•	Por último, indica el Videojuego tiene más horas estimadas y
        // la serie con mas temporadas. Muéstralos en pantalla con toda
        // su información (usa el método toString()).

        Serie series[] = new Serie[5];
        VideoJuego videoJuegos[] = new VideoJuego[5];

        series[0] = new Serie();
        series[1] = new Serie("The Walking Dead", "Frank Darabont",11,"Drama crudo");
        series[2] = new Serie("The Game of Thrones", "D. B. Weiss");
        series[3] = new Serie("The Last Man on Earth", "Will Forte", 6, "Escenario apocalíptico Comedia");
        series[4] = new Serie("Lost", "J. J. Abrams Damon Lindelof", 18, "Suspenso y Accion");

        videoJuegos[0] = new VideoJuego("grand theft auto: San Andreas", 60);
        videoJuegos[1] = new VideoJuego("need for speed most wanted", 50);
        videoJuegos[2] = new VideoJuego("Resident Evil Village", 40, "Horror y supervivencia", "Capcom");
        videoJuegos[3] = new VideoJuego("Halo Infinite", 45, "Accion", "343 Industries");
        videoJuegos[4] = new VideoJuego("God of War: Ragnarök", 30, "Accion y aventuras", "Sony Interactive Entertainment");

        series[1].entregar();
        series[3].entregar();

        videoJuegos[0].entregar();
        videoJuegos[2].entregar();
        videoJuegos[4].entregar();

        long videoEntregados = Arrays.stream(videoJuegos).filter(e -> e.isEntregado()).count();
        long serieEntregados = Arrays.stream(series).filter(e -> e.isEntregado()).count();
        long totalEntregados = videoEntregados + serieEntregados;
        System.out.println("El total de series entregadas son: " + serieEntregados);
        System.out.println("El total de videoJuegos entregados son: " + videoEntregados);

//        Arrays.stream(series).mapToInt(x->x.getNumTemp()).forEach(System.out::println);
        int maxTempo = Arrays.stream(series).mapToInt(x -> x.getNumTemp()).max().getAsInt();
        int maxHours = Arrays.stream(videoJuegos).mapToInt(x -> x.getHorasEstimadas()).max().getAsInt();

        //series[0].compareTo(series);
        //series[0].compareTo(series[1].getNumTemp());
        //Arrays.stream(series).max(Serie::compareTo).get();
        System.out.println("Las serie con mas temporadas es: ");
        System.out.println(Arrays.stream(series).max(Comparator.comparing(Serie::getNumTemp)).get());

        System.out.println("El video juego con más horas que tiene más horas estimadas es: ");
        System.out.println(Arrays.stream(videoJuegos).max(Comparator.comparing(VideoJuego::getHorasEstimadas)).get());
    }

}
