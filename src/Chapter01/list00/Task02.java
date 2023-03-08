package Chapter01.list00;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Отыскание первого неповторяющегося символа. Написать программу,
которая возвращает первый неповторяющийся (некратный) символ в заданной строке.
 */
public class Task02 {

   public static char ret1(String str) {

       var map = new LinkedHashMap<Character, Integer>();

       for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           map.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
       }
       for (Map.Entry<Character, Integer> entry : map.entrySet()) {
           if(entry.getValue() == 1) return entry.getKey();
       }
       return Character.MIN_VALUE;
   }


   public static char ret2(String str) {
       int [] mas = new int[256];
       for (int i = 0; i < mas.length; i++) {
           mas[i] = -1;
       }
       for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           if(mas[ch] == -1){
               mas[ch] = i;
           } else mas[ch] = -2;
       }

       int pos = Integer.MAX_VALUE;

       for (int i = 0; i < 256; i++) {
           if (mas[i] >= 0) {
               pos = Math.min(pos, mas[i]);
           }
       }
       return pos == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(pos);
   }
}
