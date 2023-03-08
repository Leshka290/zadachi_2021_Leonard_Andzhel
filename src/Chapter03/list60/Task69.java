package Chapter03.list60;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/*
Конвертирование временной метки UNIX в дату и время. Написать
программу, которая конвертирует временную метку UNIX в java.util.Date и
java.time.LocalDateTime.
 */
public class Task69 {

    public static void convertTime() {

        long unixTime = 1111111111;

        Instant instant = Instant.ofEpochSecond(unixTime);
        Date date = Date.from(instant);
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/Paris"));
        ZonedDateTime dateTime1 = ZonedDateTime.ofInstant(instant, ZoneId.of("Europe/Paris"));
    }
}
