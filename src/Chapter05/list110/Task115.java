package Chapter05.list110;

import java.util.*;

import static java.util.stream.Collectors.toMap;

/*
Сортировка отображения мар. Написать программу, которая сортирует
отображение Мар.
 */
public class Task115 {

    public static void sortMap() {
        Map<String, String> map = new TreeMap<>();
        map.put("postgres", "100.256.12.23");
        map.put("mysql", "100.223.98.27");
    }

    public void sortMap2() {
        Map<String, Melon> map = new HashMap<>();
        map.put("first", new Melon("Apollo", 1000));
        map.put("second", new Melon("Cantaloupe", 2000));

        Comparator<String> comparatorStr = Comparator.naturalOrder();
        sortByKeyStream(map, comparatorStr);
        Map<String, Melon> sortedMap1 = Task115.sortByKeyStream(map, comparatorStr);
        Comparator<Melon> comparatorMelon = Comparator.comparing(Melon::getWeight);
        sortByValueStream(map, comparatorMelon);
        Map<String, Melon> sortedMap2 = Task115.sortByValueStream(map, comparatorMelon);
    }

    public static <K, V> Map<K, V> sortByKeyStream(Map<K, V> map, Comparator<? super K> c){
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(c))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
    }
    public static <K, V> Map<K, V> sortByValueStream(Map<K, V> map, Comparator<? super V> c){
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(c))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
    }
    class Melon implements Comparable {

        private String type;
        private int weight;

        Melon(String type, int weight) {
            this.type = type;
            this.weight = weight;
        }
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public int compareTo(Object o) {
            return Integer.compare(this.getWeight(), ((Melon) o).getWeight());
        }
    }
}
