package Chapter04.list80;

/*
Использование типа var и неявного приведения типов для поддержания
технической сопроводимости исходного кода. Написать программу, которая
иллюстрирует, как переменная var и неявное приведение типов могут
поддерживать техническую сопроводимость исходного кода.
 */
public class Task80 {

    public static float fetchBestPrice(String [] products) {
        float realprice = 10.9F;

        return realprice;
    }

    public static boolean debitCard(float amount) {
        return true;
    }

    public static boolean purchaseCart(long customerId) {
        var price = fetchBestPrice(new String[0]);
        var paid = debitCard(price);
        return paid;
    }
}
