package Chapter01.list10;

import java.util.Arrays;
import java.util.Comparator;

/*
Сортировка массива строк по длине. Написать программу, которая
сортирует заданный массив по длине строк.
 */
public class Task15 {

    public static void returnMStr1(String [] masStr) {

        for (int i = 0; i < masStr.length; i++) {
            String temp = masStr[i];
            int j = i-1;
            while(j>=0 && temp.length() < masStr[j].length()) {
                masStr[j+1] = masStr[j];
                j--;
            }
            masStr[j+1] = temp;
        }
    }

    public static void returnMStr2(String [] masStr) {
        Arrays.sort(masStr, Comparator.comparing(t -> t.length()));
    }
}
