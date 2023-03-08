package Chapter02.list40;

import java.util.Objects;

/*
Проверка индекса в интервале от 0 до длины. Написать программу, которая
проверяет, находится ли заданный индекс между 0 (включительно) и заданной
длиной (исключительно). Если заданный индекс находится вне интервала [0;
заданной длины], ТО выбросить исключение IndexOutOfBoundsException.
 */
public class Task44 {

    public static void indexIsOut1(int end, int x) {
        if(x > end || x < 0){
            throw new IndexOutOfBoundsException("index is out");
        }
    }
    public static void indexIsOut2(int end, int x) {
        Objects.checkIndex(x, end);
    }
}
