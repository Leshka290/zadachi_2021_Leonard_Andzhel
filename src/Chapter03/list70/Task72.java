package Chapter03.list70;

import java.time.*;
import java.util.Date;

/*
Конвертирование из даты во время и наоборот. Написать программу, которая
конвертирует дату ВО время И наоборот, используя LocalDate, LocalDateTime И Т. Д.
 */
public class Task72 {

    public static void convertDate() {

        Instant instant = Instant.now();
        Date date = Date.from(instant);

        LocalTime localTime = LocalTime.ofInstant(instant, ZoneId.systemDefault());
        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.systemDefault());
        OffsetTime offsetTime = OffsetTime.ofInstant(instant, ZoneId.systemDefault());
    }
}
