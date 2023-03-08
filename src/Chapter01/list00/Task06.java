package Chapter01.list00;

/*
Подсчет появлений некоторого символа. Написать программу, которая
подсчитывает появления того или иного символа в заданной строке.
 */
public class Task06 {

    public static int charCount1(String str, char ch) {

        int charS = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                charS++;
            }
        }
        return charS;
    }

    public static long charCount2(String str, char ch) {
        return str.chars().filter(c -> c == ch)
                .count();
    }
}
