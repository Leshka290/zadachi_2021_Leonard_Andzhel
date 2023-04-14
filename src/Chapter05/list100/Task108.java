package Chapter05.list100;

import java.util.Arrays;

/*
Изменение размера массива. Написать программу, которая добавляет
элемент в массив, увеличивая его размер на единицу. Кроме того, написать
программу, которая увеличивает размер массива на заданную длину.
 */
public class Task108 {

    public static void changeArray(int array [], int newInt) {

        int copyArray [] = Arrays.copyOf(array, array.length + 1);
        copyArray[copyArray.length - 1] = newInt;

        int copyArray2 [] = Arrays.copyOf(array, array.length + newInt);
        for (int i = array.length; i < copyArray2.length; i++) {
            copyArray2[i] = newInt;
        }
    }
}
