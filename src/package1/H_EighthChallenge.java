//8)Crea una aplicación por consola que nos pida un día de la semana y que nos
//diga si es un día laboral o no. Usa un switch para ello.
package package1;

import java.util.Arrays;
import java.util.Scanner;

public class H_EighthChallenge {
    public static void main(String[] args) {
        String dateEnter;
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter one day of the week in Spanish: ");
        dateEnter = entry.nextLine().toLowerCase();
        checkDate(dateEnter.toLowerCase());
    }

    public static void checkDate(String date) {
        //String[] WEEKDAYS = {"lunes", "martes", "miercoles", "miércoles", "jueves", "viernes"};
        //boolean isWeekDay = Arrays.stream(WEEKDAYS).anyMatch(x -> x.equalsIgnoreCase(date));
        //checkWeekDay(date, isWeekDay);
        switch (date){
            case "lunes": case "martes": case "miércoles": case "jueves": case "viernes":
                System.out.println(date + "is a weekday, time to go back to work");
                break;
            case "sábado": case "sabado": case "domingo":
                System.out.println(date + "is a weekend day, let's go to the party!");
                break;
            default:
                System.out.println(date + " is not a day of the week");
                break;
        }
    }

    public static void checkWeekDay(String day, boolean isWeekday) {
        if (isWeekday) {
            System.out.println(day + " is a weekday, time to go back to work");
        } else {
            System.out.println(day + " is a weekend day, let's go to the party!");
        }
    }


}
