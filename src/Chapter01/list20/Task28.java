package Chapter01.list20;

/*
Конвертирование в число посредством беззнаковой конверсии. Написать
программу, которая конвертирует заданное число типа int в число типа long с
помощью беззнаковой конверсии.
 */
public class Task28 {

    public static void convert(int a){
        long b = Integer.toUnsignedLong(a);
        int c = Short.toUnsignedInt((short) a);
    }
}
