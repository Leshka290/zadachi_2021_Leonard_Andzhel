package Chapter03.list70;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
Разница между двумя датами. Написать программу, которая вычисляет
временной промежуток в днях между двумя датами.
 */
public class Task76 {

    public static void timeInterval() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusMonths(3);

        long betweenInDays = Math.abs(ChronoUnit.DAYS.between(localDate1, localDate2));
        long untilInDays = Math.abs(localDate1.until(localDate2, ChronoUnit.DAYS));

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2025, 2, 2, 5, 5 , 5);

        long betweenInMinutes = Math.abs(ChronoUnit.MINUTES.between(localDate1, localDate2));
    }
}
