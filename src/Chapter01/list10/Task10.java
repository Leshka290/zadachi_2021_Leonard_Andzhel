package Chapter01.list10;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/*
Генерирование всех перестановок. Написать программу, которая генерирует
все перестановки заданной строки.
 */
public class Task10 {

    public static void string1(String str) {
        string1("", str);
    }

    public static void string2(String str) {
        string2("", str);
    }

    public static void string1(String prefix, String str) {

        int n = str.length();

        if (n == 0) {
            System.out.println(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                string1(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }

    public static Set<String> string2(String prefix, String str) {
        Set<String> setStrings = new HashSet<>();

        int n = str.length();

        if (n == 0) {
            setStrings.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                setStrings.addAll(string2(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i)));
            }
        }
        return setStrings;

    }
        public static void string3 (String prefix, String str){

        int n = str.length();

        if(n == 0){
            System.out.println(prefix + " ");
        } else {
            IntStream.range(0, n)
                    .parallel()
                    .forEach(i -> string3(prefix + str.charAt(i),
                            str.substring(i +1, n) + str.substring(0, i)));
        }
        }
}