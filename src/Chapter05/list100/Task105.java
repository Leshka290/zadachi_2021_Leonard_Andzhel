package Chapter05.list100;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Инвертирование массива. Написать программу, которая инвертирует
заданный массив.
 */
public class Task105 {

    public static void ArrayInvert() {

        Object [] objectsArray = {"111", 1, "222", 56};

        for (int i = 0, j = objectsArray.length - 1; i < j; i++, j--) {
            Object elem = objectsArray[i];
            objectsArray[i] = objectsArray[j];
            objectsArray[j] = elem;
        }

        Object [] arrayObt = IntStream.rangeClosed(1, objectsArray.length)
                .mapToObj(i -> objectsArray[objectsArray.length - i]).toArray();

        for(Object o :arrayObt) {
            System.out.println(o);
        }
    }
}
