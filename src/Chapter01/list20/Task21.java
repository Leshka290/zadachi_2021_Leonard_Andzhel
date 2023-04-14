package Chapter01.list20;

/*
Удаление начальных и замыкающих пробелов. Написать программу,
которая удаляет начальные и замыкающие пробелы заданной строки.
 */
public class Task21 {

    public static String leadAndTrailSpace(String str) {

        String strNew = str.trim();
        String newStr = str.strip();

        return newStr;
    }
}
