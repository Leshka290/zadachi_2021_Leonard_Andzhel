package Chapter03.list60;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
Получение локальных даты и времени во всех имеющихся часовых
поясах. Написать программу, которая показывает местное время во всех
имеющихся часовых поясах.
 */
public class Task67 {

    public static void dateLocal() {

        List<String> listIds = new ArrayList<>();
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'T'HH:mm:ss a Z");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        zoneIds.forEach(zoneId -> {
            listIds.add(zonedDateTime.format(dateTimeFormatter) + " in" + zoneId + " is "
                    + zonedDateTime.withZoneSameInstant(ZoneId.of(zoneId)));
        });
    }
}
