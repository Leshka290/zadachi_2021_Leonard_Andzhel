package Chapter01.list10;

import java.util.regex.Pattern;

/*
Подсчет числа появлений подстроки в строке. Написать программу, которая
подсчитывает число появлений заданной строки в другой заданной строке.
 */
public class Task17 {

    public static int sumStr1(String str, String podStr) {
        int num = 0;
        int pos = 0;
        while ((pos = str.indexOf(podStr, pos)) != -1){
            pos += podStr.length();
            num++;
        }

        System.out.println(num);
        return num;
    }

    public static int sumStr2(String str, String podStr) {
        int result = str.split(Pattern.quote(podStr), -1).length -1;
        return result < 0 ? 0 : result;
    }
}
