package Chapter04.list80;

/*
LVTI и циклы for. Написать несколько примеров, иллюстрирующих
использование LVTI в циклах for.
 */
public class Task89 {

    public static void varAndFor() {

        int mas [] = {1, 2, 3};
        for (var i = 0; i < mas.length; i++) {
            mas[i] = mas[i] + 1;
        }
        for(var i : mas) {
            System.out.println(i);
        }
    }
}
