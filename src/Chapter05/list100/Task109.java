package Chapter05.list100;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

/*
Создание немодифицируемых/немутируемых коллекций. Написать
несколько примеров создания немодифицируемых и немутируемых
отображений Мар.
 */
public class Task109 {

    //немутируемое пустое отображение мар
    Map<Integer, Integer> entryMap = Collections.emptyMap();

    //немутируемое отображение мар
    Map<Integer, String> inmutableMap = Map.ofEntries(
            entry(1, "Alex"),
            entry(2, "Sam")
    );

    //немодифицируемое отображение мар
    Map<Integer, Integer> mutableMap = new HashMap<>();
    Map<Integer, Integer> getMutableMap = Map.copyOf(mutableMap);
}
