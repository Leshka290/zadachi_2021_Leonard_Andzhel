package Chapter02.list40;

import java.util.Objects;

/*
Проверка ссылок на null и возврат непустых ссылок, заданных по
умолчанию. Написать программу, которая выполняет проверки заданной ссылки на
null, и если она не является null, то возвращает ее; в противном случае
возвращает непустую ссылку по умолчанию.
 */
public class Task43 {

    public static void checkRef1(String str) {
        String defaultStr = "str = null";
        Objects.requireNonNullElse(str, defaultStr);
    }
}
