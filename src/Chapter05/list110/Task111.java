package Chapter05.list110;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
Вычисление отсутствия/присутствия элемента в отображении мар.
Написать программу, которая вычисляет значение отсутствующего ключа или
новое значение текущего ключа.
 */
public class Task111 {
    public static void findKey() throws UnknownHostException {
        String address = InetAddress.getLocalHost().getHostAddress();

        Map<String, String> map = new HashMap<>();
        map.put("postgres", "100.256.12.23");
        map.put("mysql", "100.223.98.27");
        BiFunction<String, String, String> jdbcUrl = (k,v) -> "jdbc" + k + "://" + v + ":jdbcConnect";
        String mySqlJdbcUrl = map.computeIfPresent("mysql", jdbcUrl);

        Map<String, String> map2 = new HashMap<>();
        map2.put("postgres", "jdbc://100.256.12.23/jdbcConnect");
        map2.put("mysql", "jdbc://100.223.98.27/jdbcConnect");
        Function<String, String> jdbcUrl2 = k -> k + "://" + address + "/jdbcConnect";
        String mongoDb = map2.computeIfAbsent("mongodb", jdbcUrl2);

        Map<String, String> map3 = new HashMap<>();
        map3.put("postgres", "100.256.12.23");
        map3.put("mysql", "100.223.98.27");
        BiFunction<String, String, String> jdbcUrl3 = (k,v) -> "jdbc" + k + "://"
                + ((v == null) ? address : v) + ":jdbcConnect";
        String mySqlJdbcUrl3 = map3.compute("derby", jdbcUrl3);

        Map<String, String> map4 = new HashMap<>();
        map4.put("postgres", "1.2 2.0 2.2 ");
        map4.put("mysql", "1.1 1.3 2.3 ");
        BiFunction<String, String, String> jdbcUrl4 = (k, v) -> k.concat(v);
        String mySqlVersion = map4.merge("mysql", "3.0 ", jdbcUrl4);
        System.out.println(map4.get("mysql"));

        Map<Integer, String> map5 = new HashMap<>();
        map5.put(1,"postgres");
        map5.put(2, "mysql");
        String addValue = map5.putIfAbsent(1, "derby");
        String addValue2 = map5.putIfAbsent(3, "derby");
    }
}
