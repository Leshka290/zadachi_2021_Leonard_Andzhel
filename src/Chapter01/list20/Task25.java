package Chapter01.list20;

import java.util.function.BinaryOperator;

/*
Вычисление минимума и максимума двух чисел. Написать программу,
которая возвращает минимум и максимум двух чисел.
 */
public class Task25 {

    public static void maxValue(double a, double b) {
        double max = Double.max(a, b);
        double min = Double.min(a, b);
    }

    public static void maxInt(int a, int b) {
        int max = BinaryOperator.maxBy(Integer :: compare).apply(a, b);
        int min = BinaryOperator.minBy(Integer :: compare).apply(a, b);
    }
}
