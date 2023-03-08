package Chapter01.list10;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/*
Отыскание символа с наибольшим числом появлений. Написать
программу, которая отыскивает символ с наибольшим числом появлений в заданной
строке.
 */
public class Task14 {

    public static Map <Character, Integer> charMax1(String str) {

        var colChar = new HashMap<Character, Integer>();
        char [] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            char currentCh = charStr[i];
            if(!Character.isWhitespace(currentCh)) {
                Integer noCh = colChar.get(currentCh);
                if(noCh == null){
                    colChar.put(currentCh, 1);
                }
                else {
                    colChar.put(currentCh, ++noCh);
                }
            }
        }
        int maxInt = Collections.max(colChar.values());
        char maxChar = Character.MIN_VALUE;

        for(Map.Entry<Character, Integer> entry : colChar.entrySet()){
            if(entry.getValue() == maxInt){
                maxChar = entry.getKey();
            }
        }
        return Map.of(maxChar, maxInt);
    }

    public static Map <Character, Long> charMax2(String str) {
        return str.chars().filter(c -> Character.isWhitespace(c) == false)
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet().stream().max(comparingByValue())
                .map(p -> Map.of(p.getKey(), p.getValue()))
                .orElse(Map.of(Character.MIN_VALUE, -1L));
    }
}
