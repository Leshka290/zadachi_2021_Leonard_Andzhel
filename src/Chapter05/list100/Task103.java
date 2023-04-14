package Chapter05.list100;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Создание потока из массива. Написать программу, которая создает поток из
заданного массива.
 */
public class Task103 {

    public static void arrayStream() {

        String [] stringsArr = {"1", "2", "3"};
        Stream<String> stringStream = Arrays.stream(stringsArr);
        Stream<String> stringStream1 = Stream.of(stringsArr);

        int [] intArr = {1, 2, 3};
        IntStream intStream = IntStream.of(intArr);
        IntStream intStream1 = Arrays.stream(intArr);

        Integer [] integersArr = {1, 2, 3};
        Stream<Integer> integerStream = Stream.of(integersArr);
    }
}
