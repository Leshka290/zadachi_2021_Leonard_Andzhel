package Chapter01.list00;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/*
Соединение нескольких строк с помощью разделителя. Написать
программу, которая соединяет заданные строки с помощью заданного разделителя.
 */
public class Task09 {

    public static String strNun1(char ch, String...strings) {

        var newStr = new StringBuilder();
        int i = 0;
        for (i = 0; i < strings.length - 1; i++) {
            newStr.append(strings[i]).append(ch);
        }
        newStr.append(strings[i]);

        return newStr.toString();
    }

    public static String strNun2(char ch, String...strings) {
        var joiner = new StringJoiner(String.valueOf(ch));

        for(String a : strings){
            joiner.add(a);
        }
        return joiner.toString();
    }

    public static String strNun3(char ch, String...strings) {
        return Arrays.stream(strings, 0, strings.length)
                .collect(Collectors.joining(String.valueOf(ch)));
    }

}
