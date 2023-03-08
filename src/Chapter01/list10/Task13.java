package Chapter01.list10;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
Удаление заданного символа. Написать программу, которая удаляет
заданный символ из заданной строки.
 */
public class Task13 {

    public static String strLeft1(String str, char ch) {

        StringBuilder sb = new StringBuilder();
        char [] chAr = str.toCharArray();
        for(char c : chAr){
            if(c != ch){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String strLeft2(String str, char ch) {
        return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
    }

    public static String strLeft3(String str, char ch) {
        return str.chars().filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
