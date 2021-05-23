//8)Crea una aplicación por consola que nos pida un día de la semana y que nos
//diga si es un día laboral o no. Usa un switch para ello.
package package1;

import java.util.Locale;
import java.util.Scanner;

public class EighthChallenge {
    public static void main(String[] args) {
        String dateEnter;
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter one day of the week in Spanish: ");
        dateEnter = entry.nextLine().toLowerCase();
        checkDate(dateEnter);
    }

    public static void checkDate(String date){
        switch (date){
            case "lunes":
                isWeekDay(date, true);
                break;
            case "martes":
                isWeekDay(date,true);
                break;
            case "miercoles":
                isWeekDay(date, true);
                break;
            case "jueves":
                isWeekDay(date,true);
                break;
            case "viernes":
                isWeekDay(date, true);
                break;
            case "sabado":
                isWeekDay(date, false);
                break;
            case "domingo":
                isWeekDay(date, false);
                break;
            default:
                System.out.println("Please, enter a correct value.");
        }
    }

    public static void isWeekDay(String day, boolean isweekday){
        if(isweekday) {
            System.out.println(day + " is a weekday, time to go back to work");
        }else {
            System.out.println(day + " is a weekend day, let's go to the party!");
        }
    }
}
