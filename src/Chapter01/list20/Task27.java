package Chapter01.list20;

/*
Строка как беззнаковое число с основанием системы счисления. Написать
программу, которая разбирает и конвертирует заданную строку в беззнаковое
число (типа int или long) с заданным основанием системы счисления.
 */
public class Task27 {

    public static void intStr(String str){
        int result = Integer.parseUnsignedInt(str, Character.MAX_RADIX);
    }
}
