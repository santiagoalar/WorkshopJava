//Realizar un algoritmo que permita consultar la fecha y hora actual en el
//formato (AAAA/MM/DD) (HH:MM:SS)
package package1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class M_ThirteenthChallenge {
    public static void main(String[] args) {
        LocalDateTime actualTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
        System.out.println("The actual time is: ");
        System.out.print(formatter.format(actualTime));
    }
}
