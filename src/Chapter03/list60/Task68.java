package Chapter03.list60;

import java.time.*;

/*
Вывод на экран информации о дате и времени полета. Написать программу,
которая показывает информацию о запланированном времени полета, равном
15 часам 30 минутам, а именно время перелета из Перта (Австралия) в
Бухарест (Румыния).
 */
public class Task68 {

    public static void infoTime() {

        LocalDateTime localDateTime = LocalDateTime.of(2023, Month.FEBRUARY, 27, 10, 00);
        ZonedDateTime dateTimePerth = localDateTime.atZone(ZoneId.of("Australia/Perth"));
        ZonedDateTime dateTimePerthArrive = dateTimePerth.plusHours(15).plusMinutes(30);
        ZonedDateTime dateTimeBucharest = localDateTime.atZone(ZoneId.of("Europe/Bucharest"));
        ZonedDateTime dateTimeBucharestArrive = dateTimePerthArrive.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));

        OffsetDateTime utcAtDepart = dateTimePerth.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
        OffsetDateTime utcAtArrive = dateTimePerthArrive.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
    }
}
