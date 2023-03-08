package Chapter01.list00;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
Проверка, содержит ли строковое значение только цифры. Написать
программу, которая проверяет, что заданная строка содержит только цифры.
 */
public class Task04 {

    public static boolean numbers1(String str){
        return !str.chars()
                .anyMatch(n ->Character.isDigit(n));
    }

    public static boolean numbers2(String str){
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
}

