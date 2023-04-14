package Chapter01.list20;

import java.util.ArrayList;

/*
Применение отступа. Написать несколько фрагментов кода с применением
отступа к заданному тексту.
 */
public class Task23 {

    public static String spaseString(String str, int n) {

        String newStr = str.indent(n);

        ArrayList<String> arrayList = new ArrayList<>();
        while (n > 0){
            arrayList.add(str);
            n--;
        }
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.println(arrayList.get(j).indent(j));
        }
        return arrayList.toString();
    }
}
