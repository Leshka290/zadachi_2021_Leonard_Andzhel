package Chapter03.list70;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/*
Отыскание первого/последнего дня месяца. Написать программу, которая
отыскивает первый/последний день месяца посредством класса TemporalAdjusters
JDK 8.
 */
public class Task70 {

    public static void findDayOfMonth() {

        LocalDate localDate = LocalDate.now();
        LocalDate firstDay = localDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = localDate.with(TemporalAdjusters.lastDayOfMonth());
    }
}
