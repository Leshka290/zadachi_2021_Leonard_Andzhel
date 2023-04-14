package Chapter05.list100;

/*
Минимальное, максимальное и среднее значения массива. Написать
программу, которая вычисляет минимальное, максимальное и среднее значения
заданного массива.
 */
public class Task104 {

    public static void minMaxAvgNumberArr() {

        int [] array = {1, 7, 10, 20, 3, 4};
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        int averageValue = 0;
        for (int a : array) {
            if (maxValue > a) {
                maxValue = a;
            }
            if (minValue < a) {
                minValue = a;
            }
            averageValue += a;
        }
        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(averageValue/array.length);
    }

    public static void minMaxAvgNumberArr2() {

        int[] array = {1, 7, 10, 20, 3, 4};
        int minValue = array[0];
        int maxValue = array[0];
        int averageValue = 0;
        for (int a : array) {

            maxValue = Math.max(a, maxValue);
            minValue = Math.min(a, minValue);
            averageValue += a;
        }
        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(averageValue/array.length);
    }
}
