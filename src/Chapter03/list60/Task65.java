package Chapter03.list60;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Прибавление к дате и времени и вычитание из них. Написать программу,
которая прибавляет (и вычитает) количество времени (например, годы, дни или
минуты) к объекту даты-времени (например, прибавляет час к дате, вычитает 2
ДНЯ ИЗ LocalDateTime И Т. Д.).
 */
public class Task65 {

    public static void addDateAndMonth() {

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plusDays(1);
        LocalDate localDate2 = localDate.minusMonths(1);

        Instant instant = Instant.now();
        Instant instant1 = instant.plus(5, ChronoUnit.HOURS);
        Instant instant2 = instant.minus(2, ChronoUnit.YEARS);

    }
}
