package Chapter01.list20;

import java.util.Arrays;
import java.util.stream.Stream;

/*
Трансформирование строк. Написать несколько фрагментов кода с
преобразованием строки в другую строку.
 */
public class Task24 {

    public static void newStr(String str) {

        String str1 = Stream.of(str)
                .map(s -> s + "newStr")
                .findFirst().get();
        String str2 = Stream.of(str)
                .map(s -> s.replaceAll(str, str + str))
                .findFirst()
                .get();
        String str3 = str.transform(String :: toUpperCase)
                .transform(s -> s.replaceAll("A", "AAAA"));
    }
}
