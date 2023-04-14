package Chapter01.list30;

/*
Конвертирование значения типа long в значение типа int. Написать
программу, которая конвертирует значение типа long в значение типа int.
 */
public class Task34 {

    public static void convertLong(int a){
        long b = Math.toIntExact(a);
    }
}
