package Chapter01.list10;

/*
Объявление многострочных строковых литералов (или текстовых
блоков). Написать программу, которая объявляет многострочные строковые
литералы или текстовые блоки.
 */
public class Task19 {

    public static final String LS = System.lineSeparator();

    public static void strLit1(String str) {

        String text = String.join(LS, str);
    }

    public static void strLit2(String str) {
        String text = String.format("%s", LS, "%s", LS, "%s", LS);
    }
}
