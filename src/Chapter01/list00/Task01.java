package Chapter01.list00;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
Подсчет повторяющихся символов. Написать программу, которая
подсчитывает повторяющиеся символы в заданной строке.
 */
public class Task01 {

    public static Map<Character, Integer> count1(String str){
        var result = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        System.out.println(result);
        return result;
    }

    public static Map<Character, Long> count2(String str){
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(result);
        return result;
    }
}

