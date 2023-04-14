package Chapter01.list30;

/*
Вычисление целой части деления и целой части остатка от деления.
Написать программу, которая вычисляет целую часть деления и целую часть
остатка от деления делимого (х) на делитель (у).
 */
public class Task35 {

    public static void divNums(int a, int b) {
        int c = Math.floorDiv(a, b);
        int d = Math.floorMod(a, b);
    }
}
