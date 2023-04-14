package Chapter03.list70;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
Вычисление возраста. Написать программу, которая вычисляет возраст
человека.
 */
public class Task74 {

    public static void ageHuman() {

        LocalDate humanBornDate = LocalDate.of(2000, 10, 10);
        LocalDate localDateNow = LocalDate.now();
        long years = ChronoUnit.YEARS.between(humanBornDate, localDateNow);
        Period period = Period.between(humanBornDate, localDateNow);
        System.out.println(years);
        System.out.println(period.getYears());
    }
}
