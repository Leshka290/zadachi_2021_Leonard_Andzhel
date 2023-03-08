package Chapter04.list80;

import java.util.List;
import java.util.Set;

/*
LVTI и тернарный оператор. Написать несколько фрагментов кода, которые
иллюстрируют преимущества сочетания LVTI и тернарного оператора.
 */
public class Task88 {

    public static void varAndOperator() {
        boolean value = true;
        var listOrSet = value ? Set.of(1, 2, 3) : List.of(1, 2, 3);
        var numberOrStr =
                value ? 1 : "1";
    }
}
