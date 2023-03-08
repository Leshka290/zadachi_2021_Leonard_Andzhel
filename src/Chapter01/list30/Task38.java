package Chapter01.list30;

/*
Совмещенное умножение-сложение (FMA). Написать программу, которая
берет три значения типа float/double (а, b, с) и вычисляет а*b+с эффективным
способом.
 */
public class Task38 {

    public static void fma(double a, double b, double c) {

        double fma = Math.fma(a, b, c);
    }

}
