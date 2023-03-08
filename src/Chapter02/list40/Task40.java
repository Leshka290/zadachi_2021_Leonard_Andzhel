package Chapter02.list40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/*
Проверка ссылок на null в функциональном и императивном стилях
программирования. Написать программу, которая выполняет проверки заданных
ссылок на null в функциональном и императивном стилях программирования.
 */
public class Task40 {

    public static void checkRef1(Object...objects){

        for (Object object : objects) {
            if (Objects.nonNull(object)) {
                System.out.println("Object nonNull");
            } else System.out.println("Object isNull");
        }
    }
    public static List<Integer> checkRef2(List<Integer> integers){
        if(Objects.isNull(integers)){
            return Collections.EMPTY_LIST;
        }

        List<Integer> evens = new ArrayList<>();

        for(Integer integer :integers){
            if(Objects.nonNull(integer) && integer % 2 == 0){
                evens.add(integer);
            }
        }
        return evens;
    }

    public static int sumIntegers(List<Integer> integers){
        if(Objects.isNull(integers)){
            throw new IllegalArgumentException("List cannot be null");
        }
        return integers.stream().filter(Objects :: nonNull).mapToInt(Integer :: intValue).sum();
    }

    public static boolean integersContainsNulls(List<Integer> integers){
        if(Objects.isNull(integers)){
            return false;
        } else return integers.stream().anyMatch(Objects ::isNull);
    }
}
