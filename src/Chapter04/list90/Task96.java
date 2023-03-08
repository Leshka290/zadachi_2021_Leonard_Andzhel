package Chapter04.list90;

/*
LVTI и инициализаторы null, экземплярные переменные и переменные
блоков catch. Объяснить на примерах, как LVTI может использоваться в
сочетании с инициализаторами null, экземплярными переменными и блоками
catch.
 */
public class Task96 {

    /*
        ♦ LVTI нельзя использовать с инициализаторами null:
    выдаст ошибку типа: инициализатор переменной равен 'null'
        var message = null;
    выдаст: не получается использовать 'var’ на переменной без инициализатора
        var message;
        ♦ LVTI нельзя использовать с экземплярными переменными (полями):
        public class Player {
    private var age;    ошибка: 'var' здесь не допустимо
    private var name;   ошибка: 'var' здесь не допустимо
        }
        ♦ LVTI нельзя использовать в переменных блока catch:
    try {
        ....
        } catch (var ex) { ... }

        подходит для инструкции try с объявлением ресурса (или ресурсов):
        try (var writer = new PrintWriter(new File("me.txt"))) {
            ...
         }
     */
}
