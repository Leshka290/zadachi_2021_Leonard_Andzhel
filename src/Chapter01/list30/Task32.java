package Chapter01.list30;

/*
Применение логического И/ИЛИ/исключающего ИЛИ к двум булевым
выражениям. Написать программу, которая применяет логическое
И/ИЛИ/исключающее ИЛИ к двум булевым выражениям.
 */
public class Task32 {

    public static void booleanLog(int a, int b) {
        if(Boolean.logicalAnd(a > b, b > 0)){
            a -= b;
        } else if (Boolean.logicalOr(a < b, b == 5)) {
            a += b;
        }
        else if (Boolean.logicalXor(a ==  10, b > 3)) {
            a *= b;
        }
    }
}
