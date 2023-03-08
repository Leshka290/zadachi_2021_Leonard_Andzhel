package Chapter02.list50;

/*
Переопределение метода toString(). Объяснить и продемонстрировать
способы переопределения метода toString.
 */
public class Task54 {

    public static class Car {
        private String model = " asdasd";
        private int price = 1;

        @Override
        public String toString() {
            return "Car: "+ "\n" +"Model: " + model + "\n" + "Price: " + price;
        }
    }
}
