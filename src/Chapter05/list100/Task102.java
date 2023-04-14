package Chapter05.list100;

import java.util.Arrays;

/*
Сравнение двух массивов лексикографически. Написать программу,
которая сравнивает заданные массивы лексикографически.
 */
public class Task102 {

    public static void twoArraysLex(String [] array1, String [] array2) {

        int lex = Arrays.compare(array1, array2);
        System.out.println("array1 compared lexicographically with array2 returned: " + lex);
    }
}
