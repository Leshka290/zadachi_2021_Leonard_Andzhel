package Chapter05.list110;

import java.util.HashMap;
import java.util.Map;

/*
Замена элементов в отображении мар. Написать программу, которая
заменяет данные в отображении мар.
 */
public class Task113 {

    public static void changeMapValue() {
        Map<String, String> map = new HashMap<>();
        map.put("postgres", "100.256.12.23");
        map.put("mysql", "100.223.98.27");
        map.replace("mysql", "100.100.32.22");
        map.replaceAll((k,v) -> k.equals("mysql") ? "12.12.22.22" : "111.111.2.2");
        System.out.println(map);
    }
}
