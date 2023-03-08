package Chapter01.list10;

/*
Проверка наличия подстроки в строке. Написать программу, которая
проверяет, содержит ли заданная строка заданную подстроку.
 */
public class Task16 {

    public static boolean bolStr1(String str, String podStr) {
        return str.contains(podStr);
    }

    public static boolean bolStr2(String str, String podStr) {
        return str.indexOf(podStr) != -1;
    }
}
