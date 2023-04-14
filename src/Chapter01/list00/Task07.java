package Chapter01.list00;

/*
Конвертирование строки в значение типа int, long, float или double.
Написать программу, которая конвертирует заданный объект типа string
(представляющий число) в значение типа int, long, float или double.
 */
public class Task07 {

    public static void convert1(String str) {

        try{
            int i = Integer.parseInt(str);
            double d = Double.parseDouble(str);
            float f = Float.parseFloat(str);
            long l = Long.parseLong(str);
        } catch (NumberFormatException ex){
            ex.printStackTrace();
        }

    }

}
