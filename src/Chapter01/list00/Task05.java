package Chapter01.list00;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Подсчет гласных и согласных. Написать программу, которая подсчитывает
число гласных и согласных букв в заданной строке. Сделать это для
английского языка, который имеет пять гласных (а, е, /, о и и).
 */
public class Task05 {

    private static final Set<Character> allVovels = new HashSet<>(Arrays.asList('a','e','i', 'o', 'u'));
    public static Map<Integer, Integer> countVC1 (String str) {
        str.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(allVovels.contains(ch)){
                vowels++;
            } else if (ch >= 'a' && ch <= 'z'){
                consonants++;
            }
        }
        System.out.println(Map.of(vowels, consonants));
        return Map.of(vowels,consonants);
    }

    public static Map<Long, Long> countVC2 (String str) {

        str.toLowerCase();

        long vowels = str.chars()
                .filter(c -> allVovels.contains((char) c))
                .count();
        long consonants = str.chars()
                .filter(c -> !allVovels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();
        return Map.of(vowels,consonants);
    }

    public static void countVC3 (String str) {

        str.toLowerCase();
        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length(); i++) {
            int vowels = switch (str.charAt(i)){
                case 'a', 'e','i', 'o', 'u' -> a++;
                default -> b++;
        };
        }
        System.out.println(a + " " + b);
    }
}
