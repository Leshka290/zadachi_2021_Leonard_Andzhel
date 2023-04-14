package Chapter01.list10;

/*
Проверка, что строка является палиндромом. Написать программу, которая
выясняет, является ли данная строка палиндромом или нет.
 */

public class Task11 {

    public static boolean palindrome1(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean palindrome2(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (right>left){
            if(str.charAt(right) != str.charAt(left)){
                return false;
            }
                left++;
                right--;
        }
        System.out.println("da");
        return true;
    }

    public static boolean palindrome3(String str) {
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
}
