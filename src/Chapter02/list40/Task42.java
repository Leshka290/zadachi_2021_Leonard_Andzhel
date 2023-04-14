package Chapter02.list40;

import java.util.Objects;

/*
Проверка ссылок на null и выбрасывание заданного исключения
(например, исключения IllegalArgumentException). Написать программу, которая
выполняет проверки заданных ссылок на null и выбрасывает указанное исключение.
 */
public class Task42 {

    public static void checkRef1(String s, Integer a) {
        if(s == null){
            throw new IllegalArgumentException("s isNull");
        }
    }

    public static <T> T requireNonNullElseThrowIAE(T obj, String message) {
        if(obj == null){
            throw new IllegalArgumentException(message);
        }
        return obj;
    }
    public static <T, X extends Throwable> T requireNonNullElseThrow(T obj, X exception) throws X {
        if (obj == null) {
            throw exception;
        }
        return obj;
    }
}
