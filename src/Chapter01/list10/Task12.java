package Chapter01.list10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/*
Удаление повторяющихся символов. Написать программу, которая удаляет
повторяющиеся символы из заданной строки.
 */
public class Task12 {

    public static void repeatChar1(String str) {

        var newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(newStr.indexOf(String.valueOf(str.charAt(i))) == -1){
                newStr.append(str.charAt(i));
            }
        }
    }
    public static void repeatChar2(String str) {

        var hashSet = new HashSet<Character>();
        var sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for(char a : chars){
            if(hashSet.add(a)){
                sb.append(a);
            }
        }
    }

    public static String repeatChar3(String str) {
        return Arrays.asList(str.split("")).stream().distinct().collect(Collectors.joining());
    }
}
