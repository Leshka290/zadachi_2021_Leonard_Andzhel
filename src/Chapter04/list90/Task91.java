package Chapter04.list90;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Использование LVTI для разбиения вложенных/крупных цепочек
выражений. Написать программу, которая демонстрирует использование LVTI для
разбиения вложенной/крупной цепочки выражений.
 */
public class Task91 {

    public static void vatAndChains() {

        var intList = List.of(1, 2, 3, 4, 5);

        var evenAndOdd = intList.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .values();

        var evenOrOdd = evenAndOdd.stream()
                .max(Comparator.comparing(List::size))
                .orElse(Collections.emptyList());

        var sumEvenOrOdd = evenOrOdd.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
