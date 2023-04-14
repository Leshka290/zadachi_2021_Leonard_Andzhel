package Chapter05.list100;

import java.util.Arrays;

/*
Проверка эквивалентности или несовпадения двух массивов. Написать
программу, которая проверяет эквивалентность двух заданных массивов или
их несовпадение.
 */
public class Task101 {

    public static boolean twoArrays(Object [] array1, Object [] array2) {

        if(array1 == null || array2 == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if(array1.length != array2.length) {
            System.out.println(false);
            return false;
        } else  {
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] != array2[i]) {
                    System.out.println(false);
                    return false;
                }
            }
        }
        System.out.println(true);
        return true;
    }
    public static boolean twoArrays2(Object [] array1, Object [] array2) {

        boolean isEquals = Arrays.equals(array1, array2);
        System.out.println(isEquals);
        return isEquals;
    }
}
