package Chapter02.list40;

import java.util.Objects;

/*
Проверка подинтервала в интервале от 0 до длины. Написать программу,
которая проверяет, чтобы заданный подинтервал [заданное начало; заданный
конец] находился внутри интервала [0; заданная длина]. Если заданный
подинтервал отсутствует внутри интервала [0; заданная длина], то выбросить
исключение IndexOutOfBoundsException.
 */
public class Task45 {

    public static void interval(int fromIndex, int size, int length) {
        Objects.checkFromIndexSize(fromIndex, size, length);
    }
}
