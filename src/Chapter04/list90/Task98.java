package Chapter04.list90;

/*
LVTI, подстановочные знаки, коварианты и контраварианты. Написать
несколько фрагментов кода, которые иллюстрируют, как LVTI может
использоваться в сочетании с подстановочными знаками, ковариантами и контрава-
риантами.
 */
public class Task98 {

    /*
    Collection<?> stuff = new ArrayList<> () ;
    stuff.add("hello"); // ошибка времени компиляции (несовместимые типы)

    var arrayList = new ArrayList<> ();
    arrayList.add("hello"); // ошибки нет, но так делать не стоит


    Подход с заменой ковариантов (foo<? extends т>) или контравариантов (foo<? super т>)
    на LVTI является опасным, и его следует избегать.

    // явные типы
    Class<? extends Number> intNumber = Integer.class;
    Class<? super FilterReader> fileReader = Reader.class;

    // используя var
    var intNumber = Integer.class;
    var fileReader = Reader.class;

    Теперь мы можем присвоить этим переменным любой класс, и наши границы/ограничения исчезнут.

    // это компилируется без проблем
    var intNumber = Reader.class;
    var fileReader = Integer.class;

    Таким образом, решение использовать переменную типа var в место наших
коварианта и контраварианта было плохим!
     */
}
