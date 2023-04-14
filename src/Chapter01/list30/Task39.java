package Chapter01.list30;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.text.ParseException;
import java.util.Locale;
/*
Компактное форматирование чисел. Написать программу, которая
форматирует число 1,000,000' в 1М (локаль США) и в 1 mln (итальянская локаль).
В добавление к этому, выполнить разбор 1М и 1 mln из строки с конвертацией
в число.
 */
public class Task39 {

    private Task39() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static String forLocale(Locale locale, double number) {
        return format(locale, Style.SHORT, null, number);
    }

    public static String forLocaleStyle(Locale locale, Style style, double number) {
        return format(locale, style, null, number);
    }

    public static String forLocaleStyleRound(Locale locale, Style style, RoundingMode mode, double number) {
        return format(locale, style, mode, number);
    }

    public static Number parseLocale(Locale locale, String number)
            throws ParseException {
        return parse(locale, Style.SHORT, false, number);
    }

    public static Number parseLocaleStyle(Locale locale, Style style, String number)
            throws ParseException {
        return parse(locale, style, false, number);
    }

    public static Number parseLocaleStyleRound(Locale locale, Style style, boolean grouping, String number)
            throws ParseException {
        return parse(locale, style, grouping, number);
    }

    private static String format(Locale locale, Style style, RoundingMode mode, double number) {

        if (locale == null || style == null) {
            return String.valueOf(number); // or use a default format
        }

        NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, style);

        if (mode != null) {
            nf.setRoundingMode(mode);
        }

        return nf.format(number);
    }

    private static Number parse(Locale locale, Style style, boolean grouping, String number)
            throws ParseException {

        if (locale == null || style == null || number == null) {
            throw new IllegalArgumentException("Locale/style/number cannot be null");
        }

        NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, style);
        nf.setGroupingUsed(grouping);

        return nf.parse(number);
    }
}
