package Chapter01.list20;

/*
Сравнение двух беззнаковых чисел. Написать программу, которая
сравнивает два заданных числа как беззнаковые.
 */
public class Task29 {

    public static void matchNumbers(int a, int b) {
        int result = Integer.compareUnsigned(a, b);
    }
}
