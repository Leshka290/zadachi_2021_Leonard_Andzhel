package Chapter01.list00;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
Инвертирование букв и слов. Написать программу, которая инвертирует
буквы каждого слова, и программу, которая инвертирует буквы каждого слова и
сами слова.
 */
public class Task03 {

    public static String revers1(String str){

        String space = " ";
        StringBuilder reversString = new StringBuilder();

        String [] mas = str.split(space);

        for(String word : mas){
            StringBuilder reversWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {

                reversWord.append(word.charAt(i));
            }
            reversString.append(reversWord).append(space);
        }
        System.out.println(reversString);
        return reversString.toString();
    }

    public static String revers2(String str){
        Pattern PATTERN = Pattern.compile(" +");
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String revers3(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
