package Chapter04.list90;

/*
LVTI может быть финальной и фактически финальной. Написать несколько
фрагментов кода, которые иллюстрируют, как LVTI может использоваться для
финальных и практически финальных переменных.
 */
public class Task94 {

    interface Weighter {
       int  getMarginOfError();
    }

    public static int fetchRatio() {

        final var limit = 15;
        final var bmi = 10;

        return limit * bmi;
    }

    public static void varAndFinal() {

        var ratio = fetchRatio();

        var weighter = new Weighter() {
            @Override
            public int getMarginOfError() {
                return ratio * 4;
            }
        };
    }
}
