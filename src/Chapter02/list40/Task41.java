package Chapter02.list40;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Проверка ссылок на null и выбрасывание собственного исключения
NullPointerException. Написать программу, которая выполняет проверку
заданных ссылок на null и выбрасывает исключение NullPointerException со
специализированными сообщениями.
 */
public class Task41 {

    public static void checkRef1(Object...objects) {

        List<String> strings= new ArrayList<>();
        for(Object obj : objects) {
            if(Objects.nonNull(obj)) {
                strings.add((String) obj);
            } else {
                throw new NullPointerException("Object isNull");
            }
        }
    }

    public static void checkRef2(String name, Integer integer) {
        Objects.requireNonNull(name, "Name isNull");
        Objects.requireNonNull(integer, "Integer isNull");
    }
}
