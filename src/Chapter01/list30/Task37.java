package Chapter01.list30;

import java.util.function.BinaryOperator;

/*
Умножение двух крупных значений типа int/iong и переполнение
операции. Написать программу, которая умножает два крупных значения типа
int/iong и выбрасывает арифметическое исключение в случае переполнения
операции.
 */
public class Task37 {

    public static void multValues(int a, int b) {

        int c = Math.multiplyExact(a, b);
        long d = Math.multiplyFull(a, b);

        BinaryOperator<Integer> binaryOperator = Math::multiplyExact;
        int e = binaryOperator.apply(a, b);

    }
}
