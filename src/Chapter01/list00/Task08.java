package Chapter01.list00;

/*
Удаление пробелов из строки. Написать программу, которая удаляет все
пробелы из заданной строки.
 */
public class Task08 {

    public static String strNun1(String str) {
        return str.replaceAll("\\s", "");
    }
}