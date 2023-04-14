package Chapter01.list20;

import java.util.function.BinaryOperator;

/*
Сложение двух крупных чисел типа int/long и переполнение операции.
Написать программу, которая складывает два крупных числа int/long и
выбрасывает арифметическое исключение в случае переполнения операции.
 */
public class Task26 {

    public static void bigInt(int a, int b) {
            int c = Math.addExact(a, b);
    }

    public static void bigLong(long a, long b) {
        BinaryOperator<Long> operator = Math :: addExact;
        long c = operator.apply(a, b);
    }
}
