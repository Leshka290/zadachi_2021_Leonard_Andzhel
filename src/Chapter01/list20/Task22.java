package Chapter01.list20;

/*
Отыскание наибольшего общего префикса. Написать программу, которая
отыскивает наибольший общий префикс заданных строк.
 */
public class Task22 {

    public static String prefix(String...strings) {

        if(strings.length == 1){
            return "";
        }

        int strLength = strings[0].length();

        for (int i = 0; i < strLength; i++) {
            char ch = strings[0].charAt(i);
            for (int j = 0; j < strings.length; j++) {
                if(ch != strings[j].charAt(i) || i == strings[j].length()){
                    return strings[j].substring(0, i);
                }
            }
        }
        return "";
    }
}
