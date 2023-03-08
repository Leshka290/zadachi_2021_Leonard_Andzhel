package Chapter04.list80;

/*
Явное понижающее приведение типов или как избегать типа var. Написать
программу, которая иллюстрирует сочетание типа var и явного понижающего
приведения типов и объясняет причину, почему тип var следует избегать.
 */
public class Task81 {

    public static void downCasting() {
        var byteNum = (byte) 5;
        var shortNum = (short) 5;
    }
}
