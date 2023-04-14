package Chapter05.list110;

import java.util.HashMap;
import java.util.Map;

/*
Возврат значения по умолчанию из коллекции мар. Написать программу,
которая получает значение из отображения мар либо значение по умолчанию.
 */
public class Task110 {

    public static void mapReturnDefault() {
        Map<String, String> map = new HashMap<>();
        map.put("Alex", "Komarovo");
        map.put("Sam", "Moscow");
        String defaultValue = map.getOrDefault("Ivan", "Paris");
    }
}
