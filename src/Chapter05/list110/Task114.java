package Chapter05.list110;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Сравнение двух отображений мар. Написать программу, которая сравнивает
два отображения мар.
 */
public class Task114 {

    public static void compareMap() {

        Map<String, String> map1 = new HashMap<>();
        map1.put("postgres", "100.256.12.23");
        map1.put("mysql", "100.223.98.27");

        Map<String, String> map2 = new HashMap<>();
        map2.put("postgres", "100.256.12.23");
        map2.put("mysql", "100.223.98.27");

        boolean compare = map1.equals(map2);

        Map<String, String[]> map3 = new HashMap<>();
        String[] arrayStr1 = {"1", "2", "3"};
        map3.put("postgres", arrayStr1);
        map3.put("mysql", arrayStr1);

        Map<String, String[]> map4 = new HashMap<>();
        String[] arrayStr2 = {"1", "2", "3"};
        map4.put("postgres", arrayStr2);
        map4.put("mysql", arrayStr2);
        System.out.println(equalsArrays(map3, map4));
    }

    public static <A, B> boolean equalsArrays(Map<A, B[]> first, Map<A, B[]> second) {
        if(first.size() != second.size()) {
            return false;
        } return first.entrySet().stream()
                .allMatch(e -> Arrays.equals(e.getValue(), second.get(e.getValue())));

    }
}
