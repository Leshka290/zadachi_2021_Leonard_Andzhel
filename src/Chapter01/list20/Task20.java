package Chapter01.list20;

import java.util.Collections;

/*
Конкатенирование одной и той же строки п раз. Написать программу,
которая конкатенирует одну и ту же строку заданное число раз.
 */
public class Task20 {

    public static String starConc1(String str, int n) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.length() * n);
        for (int i = 0; i < n; i++) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public static String starConc2(String str, int n) {

        String newStr = str.repeat(n);
        return newStr;
    }

    public static String starConc3(String str, int n) {
        String newStr = String.join("", Collections.nCopies(n, str));
        return newStr;
    }
}
