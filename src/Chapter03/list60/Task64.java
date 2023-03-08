package Chapter03.list60;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
Получение единиц даты и времени. Написать программу, которая извлекает
единицы даты и времени (например, извлекает из даты год, месяц, минуту и т.
д.) из объекта, представляющего дату-время.
 */
public class Task64 {

    public static void getDateAndTime() {
        LocalDateTime ldt = LocalDateTime.now();
        int year = ldt.getYear();
        int month = ldt.getMonthValue();
        int day = ldt.getDayOfMonth();
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        int nano = ldt.getNano();
    }
}
