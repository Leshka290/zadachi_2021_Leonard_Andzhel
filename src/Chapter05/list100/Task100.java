package Chapter05.list100;

/*
Поиск элемента в массиве. Написать несколько программ, которые
иллюстрируют способ отыскания заданного элемента (примитивного и объекта) в
заданном массиве. Найти индекс и/или просто проверить, что значение
находится в массиве.
 */
public class Task100 {

    public static <T> int arraySearch(T array[], T toFind) {

        if (array == null || toFind == null) {
            throw new IllegalArgumentException("None of the arguments can be null");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(toFind)) {
                System.out.println("Index object : " + i);
                return i;
            }
        }
        return -1;
    }

    public static boolean arraySearch2(int array[], int toFind) {

        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        for (int i = 0; i <array.length; i++) {
            if (array[i] == toFind) {
                System.out.println("Number is found, index : " + i);
                return true;
            }
        }
        return false;
    }
}