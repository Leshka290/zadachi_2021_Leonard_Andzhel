package Chapter01.list30;

/*
Следующее значение с плавающей точкой. Написать программу, которая
возвращает следующую плавающую точку, смежную с заданным значением
типа float/double в направлении положительной и отрицательной бесконечности.
 */
public class Task36 {

    public static void nextValue(double a, float b) {
        double a1 = Math.nextUp(a);
        double a2 = Math.nextDown(a);
        float b1 = Math.nextUp(b);
        float b2 = Math.nextDown(b);
    }
}
