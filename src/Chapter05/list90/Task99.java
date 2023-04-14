package Chapter05.list90;

/*
	Сортировка массива. Написать несколько программ, которые
иллюстрируют разные алгоритмы сортировки массивов. Также написать программу для
перетасовки массивов.
 */
public class Task99 {

    public static void sortMas(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
