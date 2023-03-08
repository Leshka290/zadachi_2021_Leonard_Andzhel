package Chapter01.list30;

import java.math.BigInteger;

/*
Конвертирование значения типа Biginteger в примитивный тип. Написать
программу, которая извлекает значение примитивного типа из заданного
значения типа Biginteger.
 */
public class Task33 {

    public  static void bigInt(BigInteger bigInteger) {
        int a = bigInteger.intValueExact();
    }
}
