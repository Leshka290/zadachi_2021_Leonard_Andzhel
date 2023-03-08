package Chapter04.list70;

/*
Использование типа var с примитивными типами. Написать программу,
которая иллюстрирует применение переменной var с примитивными типами
Java (int, long, float И double).
 */
public class Task79 {

    public static void primitiveType() {

        var intNum = 5;
        var doubleNum = 5.5;
        var doubleResult = doubleNum + intNum;
        var longNum = 5L;
        var booleanVal = true;
        var charC = 'C';
    }
}
