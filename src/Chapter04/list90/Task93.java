package Chapter04.list90;

/*
LVTI и анонимные классы. Написать несколько фрагментов кода, которые
иллюстрируют использование LVTI в анонимных классах.
 */
public class Task93 {

    class Human {

    }

    public  void varAndAClass() {

        var human = new Human() {
           public int newInt() {
               return 1;
           }
        };
    }
}
