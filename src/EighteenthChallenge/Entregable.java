//•	entregar(): cambia el atributo prestado a true.
//•	devolver(): cambia el atributo prestado a false.
//•	isEntregado(): devuelve el estado del atributo prestado.
//•	Método compareTo (Object a), compara las horas estimadas
// en los videojuegos y en las series el numero de temporadas.
// Como parámetro que tenga un objeto, no es necesario que implementes
// la interfaz Comparable. Recuerda el uso de los casting de objetos.
package EighteenthChallenge;

public interface Entregable {
    boolean entregar();
    boolean devolver();
    int compareTo (Object a);
}
