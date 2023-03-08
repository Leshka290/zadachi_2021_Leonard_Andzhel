package Chapter03.list70;

import java.time.*;

/*
Начало и конец дня. Написать программу, которая возвращает время начала и
конца дня.
 */
public class Task75 {

    public static void timeDay() {

        LocalDate localDate = LocalDate.now();

        LocalDateTime localDateTimeStart1 = localDate.atStartOfDay();
        LocalDateTime localDateTimeStart2 = LocalDateTime.of(localDate, LocalTime.MAX);

        LocalDateTime localDateTimeEnd1 = localDate.atTime(LocalTime.MAX);
        LocalDateTime localDateTimeEnd2 = LocalTime.MAX.atDate(localDate);

        ZonedDateTime idDayStart = LocalDateTime.of (localDate, LocalTime.MIN).atZone(ZoneId.of("Europe/Paris"));
        ZonedDateTime ifDayEnd = localDate.atTime(LocalTime.MAX).atZone(ZoneId.of("Europe/Paris"));
    }
}
