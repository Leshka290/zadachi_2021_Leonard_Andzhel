package Chapter03.list60;

import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

/*
Машинное время посредством класса instant. Объяснить и привести пример
API Instant.
 */
public class Task62 {

    /*
    Класс instant представляет собой мгновенную точку на временной
шкале, начиная с первой секунды 1 января 1970 года (эпоха), в часовом поясе UTC
с разрешающей способностью в наносекунду.
    Класс instant Java 8 по своей концепции аналогичен классу java.util.Date. Оба
представляют момент на временной шкале в UTC. В то время как instant имеет
разрешающую способность до наносекунды, в java.util.Date она кратна
миллисекунде.
     */

    Instant instant = Instant.now();
    OffsetDateTime odt = OffsetDateTime.now();
    Clock clock = Clock.systemUTC();
    Instant instant2 = instant.plus(2, ChronoUnit.HOURS);
    boolean isBefore = instant.isBefore(odt.toInstant());
    boolean isAfter = clock.instant().isAfter(instant);
}
