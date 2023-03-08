package Chapter03.list50;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
Форматирование даты и времени. Объяснить форматный шаблон для даты и
времени.
 */
public class Task59 {

    /*

Шаблон                 Пример
yyyy-MM-dd             2019-02-24
MM-dd-yyyy             02-24-2019
MMM-dd-yyyy            Feb-24-2019
dd-MM-yy               24-02-19
dd.MM.yyyy             24.02.2019
yyyy-MM-dd HH:mm:ss    2019-02-24 11:26:26
     */

    LocalTime localTime = LocalTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    String stringLT = dtf.format(localTime);
    String stringLD = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

}
