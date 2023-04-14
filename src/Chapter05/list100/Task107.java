package Chapter05.list100;

/*
Следующий больший элемент. Написать программу, которая возвращает
следующий больший элемент для каждого элемента массива.
 */
public class Task107 {

    public static void nextBigValue(int [] array) {

        for (int i = 0; i < array.length; i++) {
            int n = 0;
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                     n = array[j];
                     break;
                }
            }
        }
    }
}
