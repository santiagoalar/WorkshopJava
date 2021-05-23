//15) Hacer un programa que muestre el siguiente menú de opciones
//****** GESTION CINEMATOGRÁFICA ********
//1-NUEVO ACTOR
//2-BUSCAR ACTOR
//3-ELIMINAR ACTOR
//4-MODIFICAR ACTOR
//5-VER TODOS LOS ACTORES
//6- VER PELICULAS DE LOS ACTORES
//7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
//8-SALIR
//
//
//EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE
// UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO
// DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION
// INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
//PISTA: CONBINAR SWICHT Y ALGUNO DE LOS BUCLES.
package package1;

import java.util.Scanner;

public class FifteenthChallenge {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner entry = new Scanner(System.in);
        byte answer = 0;
        do {
            System.out.println("****** GESTION CINEMATOGRÁFICA ********" +
                    "\n1-NUEVO ACTOR\n2-BUSCAR ACTOR\n3-ELIMINAR ACTOR" +
                    "\n4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES" +
                    "\n6- VER PELICULAS DE LOS ACTORES\n7-VER CATEGORIA " +
                    "DE LAS PELICULAS DE LOS ACTORES\n8-SALIR");
            answer = entry.nextByte();
            switch (answer) {
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (answer != 8);
    }
}
