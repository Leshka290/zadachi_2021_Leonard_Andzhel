package Chapter03.list70;

import java.time.*;

/*
Определение/извлечение поясных смещений. Написать программу, которая
раскрывает разные технические приемы определения и извлечения поясных
смещений.
 */
public class Task71 {

    public static void zoneOffset() {
        ZoneOffset zoneOffset = ZoneOffset.of("+01:00");
        OffsetTime offsetTime = OffsetTime.now(zoneOffset);
        OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffset);

        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        ZoneOffset zoneOffset1 = zoneId.getRules().getOffset(localDateTime);

        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(5);
        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(5, 15);
    }
}
