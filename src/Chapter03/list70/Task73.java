package Chapter03.list70;

import java.time.LocalDate;

/*
Обход интервала дат в цикле. Написать программу, которая обходит
интервал заданных дат в цикле день за днем (с шагом в один день).
 */
public class Task73 {

   static LocalDate localDate1 = LocalDate.now();
   static LocalDate localDate2 = localDate1.plusDays(8);
    public static void dateCycle1() {
        for(LocalDate date = localDate1; date.isBefore(localDate2); date = date.plusDays(1)) {
            System.out.println(date);
        }
    }

    public static void dateCycle2() {
        localDate1.datesUntil(localDate2).forEach(System.out::println);
    }
}
