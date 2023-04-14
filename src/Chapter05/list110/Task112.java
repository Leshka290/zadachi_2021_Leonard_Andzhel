package Chapter05.list110;

import java.util.*;

/*
Удаление элемента из отображения мар. Написать программу, которая
удаляет элемент из отображения мар посредством заданного ключа.
 */
public class Task112 {

    public static void removeValue() {
        Map<String, String> map = new HashMap<>();
        map.put("postgres", "100.256.12.23");
        map.put("mysql", "100.223.98.27");
        map.remove("postgres");
    }
}
