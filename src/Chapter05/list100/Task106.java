package Chapter05.list100;

import java.util.Arrays;

/*
Заполнение и настройка массива. Написать несколько примеров
заполнения массива и задания всех элементов на основе генераторной функции для
вычисления каждого элемента.
 */
public class Task106 {

    public static void arrayFill() {

        int array [] = new int[5];
        Arrays.fill(array, 5);

        Arrays.setAll(array, i ->{
          if(i == 0) {
              return array[i];
          } else {
              return array[i - 1] + 1;
          }
        });
    }
}
