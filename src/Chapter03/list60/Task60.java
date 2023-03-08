package Chapter03.list60;

import java.time.LocalDate;
import java.time.LocalTime;

/*
Получение текущих даты и времени без времени или даты. Написать
программу, которая извлекает текущую дату без времени или даты.
 */
public class Task60 {

    public static void dateAndTime() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
    }
}
