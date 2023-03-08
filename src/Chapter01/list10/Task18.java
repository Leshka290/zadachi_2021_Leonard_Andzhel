package Chapter01.list10;

import java.util.Arrays;

/*
Проверка, являются ли две строки анаграммами. Написать программу,
которая проверяет, являются ли две строки анаграммами. Учесть, что анаграммой
строки является строка, образованная перестановкой букв в обратном порядке
с игнорированием заглавных букв и пробелов.
 */
public class Task18 {
    private static final int EXTENDED_ASCII_CODES = 256;

    public static boolean strAnog1(String str1, String str2) {

        int [] chCounts = new int[EXTENDED_ASCII_CODES];
        char [] chStr1 = str1.replaceAll("\\S", "").toLowerCase().toCharArray();
        char [] chStr2 = str2.replaceAll("\\S", "").toLowerCase().toCharArray();

        if(chStr1.length != chStr2.length){
            return false;
        }
        for (int i = 0; i < chStr1.length; i++) {
            chCounts[chStr1[i]]++;
            chCounts[chStr2[i]]--;
        }
        for (int i = 0; i < chCounts.length; i++) {
            if(chCounts[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean strAnog2(String str1, String str2) {

        char [] chStr1 = str1.toCharArray();
        char [] chStr2 = str2.toCharArray();

        if(chStr1.length != chStr2.length){
            return false;
        }
        Arrays.sort(chStr1);
        Arrays.sort(chStr2);
        return Arrays.equals(chStr1, chStr2);
    }
}
