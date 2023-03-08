package Chapter03.list60;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
Определение временного периода с использованием значений на основе
даты (Period) и значений на основе времени (Duration). Объяснить и привести
пример использования API Period И Duration.
 */
public class Task63 {

    public static void periodAndDuration() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2010,10,1);
        Period period = Period.between(localDate1, localDate2);
        Period period1 = period.plus(period);
        boolean a = period.isNegative();

        Duration duration = Duration.ofDays(1);
        Duration duration1 = Duration.of(5, ChronoUnit.HOURS);
        Duration duration2 = Duration.parse("P1DT4H2M");
        Duration duration3 = duration.plus(duration);
        Duration duration4 = Duration.between(localDate1, localDate2);
    }
}
