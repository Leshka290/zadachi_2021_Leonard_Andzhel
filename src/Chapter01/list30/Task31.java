package Chapter01.list30;

/*
Значение типа double/float является конечным значением с плавающей
точкой. Написать программу, которая определяет, что заданное значение типа
double/float является конечным значением с плавающей точкой.
 */
public class Task31 {

    public static void isFinite(double a, float b){

        if (Double.isFinite(a)){
            a += a;
        } else {
            a =0;
        }
        if(Float.isFinite(b)){
            b += b;
        } else {
            b = 0;
        }
    }
}
