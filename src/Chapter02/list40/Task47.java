package Chapter02.list40;

/*
Немутируемые объекты в двух словах. Объяснить и проиллюстрировать, что
такое немутируемый объект в среде Java.
 */
public class Task47 {

    /*
    Немутируемый объект —  это объект, который не может быть изменен (его состояние
фиксировано) после его создания. В языке Java действуют следующие правила:
♦ примитивные типы являются немутируемыми;
♦ всем известный класс string среды Java является немутируемым (другие классы
тоже ЯВЛЯЮТСЯ немутируемыми, например Pattern И LocalDate);
♦ массивы не являются немутируемыми;
♦ коллекции могут быть мутируемыми, немодифицируемыми или немутируемыми.

Немутируемые объекты полезны в конкурентных (многонитевых)1 приложениях и
потоках. Поскольку немутируемые объекты не могут быть изменены, они не
подвержены проблемам конкурентности и не рискуют быть поврежденными или
несогласованными.
     */
}
