package Chapter03.list60;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
Класс LocalDateTime ИЗ LocalDate И LocalTime. Написать Программу, которая
строит экземпляр класса LocalDateTime ИЗ объектов LocalDate И LocalTime. Она
объединяет дату И Время В ОДНОМ объекте LocalDateTime.
 */
public class Task61 {

    public static void localDateTime() {
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
    }
}
