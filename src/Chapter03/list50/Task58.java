package Chapter03.list50;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

/*
    Конвертирование строки в дату и время. Написать программу, которая
иллюстрирует конвертацию из строки в дату-время и обратно.
     */
public class Task58 {

    public static void convertStr(String str) {

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");
        LocalDate localDate1 = LocalDate.parse(str, dtf1);
        LocalDate localDate2 = LocalDate.parse(str, dtf2);
        String str1 = localDate1.toString();
        String str2 = localDate2.toString();
    }
}
