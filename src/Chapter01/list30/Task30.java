package Chapter01.list30;

/*
Вычисление частного и остатка от деления беззнаковых значений.
Написать программу, которая вычисляет частное и остаток заданного беззнакового
значения.
 */
public class Task30 {

    public static void divValues(int a, int b) {

        int div = Integer.divideUnsigned(a,b);
        int modul = Integer.remainderUnsigned(a,b);
    }
}
