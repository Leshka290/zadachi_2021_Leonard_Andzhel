package Chapter04.list70;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;

/*
Простой пример с использованием переменной типа var. Написать
программу, которая иллюстрирует правильное использование логического вывода
типа (переменной типа var) в отношении удобочитаемости кода.
 */
public class Task78 {

    public static void useVar() {

        var outputSteam = new ByteArrayOutputStream();
        var intNum = 20;
        var longNum = 20L;
        var numbers = new int []{1, 2, 4, 65, 6};
        for (var i = 0; i < numbers.length; i++) {
            numbers[i] += intNum;
        }
    }
}
