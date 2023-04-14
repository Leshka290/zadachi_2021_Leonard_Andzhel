package Chapter04.list80;

/*
Сочетание LVTI и программирования согласно интерфейсу. Написать
программу, которая иллюстрирует использование типа var посредством
программирования согласно интерфейсу.
 */
public class Task83 {

    /*
    К сожалению, LVTI не может воспользоваться преимуществами программирования
согласно интерфейсу. Другими словами, когда мы используем тип var, логически
выводимым типом является конкретная имплементация, а не контракт.
    Например,замена List<string> на var приведет к логически выведенному типу
ArrayList<String>:
var playerList = new ArrayList<String>();
Тем не менее есть несколько объяснений, которые поддерживают это поведение:
♦ LVTI действует на локальном уровне (локальные переменные), где
программирование согласно интерфейсу используется меньше, чем параметры метода либо
возвращаемые из метода типы значений или типы полей;
♦ поскольку локальные переменные имеют малую область видимости, изменения,
индуцируемые переключением на другую имплементацию, также должны быть
малыми. Имплементация переключения должна оказывать малое влияние на
обнаружение и исправление кода;
♦ LVTI рассматривает код с правой стороны в качестве инициализатора, который
полезен для вывода фактического типа. Если этот инициализатор будет изменен
в будущем, то логически выводимый тип может отличаться, и это станет
причиной проблемой в коде, использующем эту переменную.
     */
}
