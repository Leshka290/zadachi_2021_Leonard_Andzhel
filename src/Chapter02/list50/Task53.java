package Chapter02.list50;
import java.io.*;

/*
Клонирование объектов. Написать программу, которая иллюстрирует методы
мелкого и глубокого клонирования.
 */
public class Task53 {
    // Через конструктор
    Point point = new Point(1, 2);
    Point clone = new Point(point);

    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(Point another) {
            this.x = another.x;
            this.y = another.y;
        }
    }

    // Посредством библиотеки Cloning
    // import com.rits.cloning.Cloner;
    /*
    Point point =new Point(...);
    Cloner cloner =new Cloner ();
    Point clone =cloner.deepClone(point);
     */

    //Посредством сериализации
    private static <T> T cloneThroughSerialization(T t) {
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(t);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);

            return (T) ois.readObject();
        } catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
            return t;
        }
    }

    Point clone1 = cloneThroughSerialization(point);

    //Посредством JSON
    /*
    private static <T> T cloneThroughJson(T t) {
        Gson gson = new Gson;
        String json = gson.toJson(t);

        return (T) gson.fromJson(json, t.getClass());
    }

    Point clone2 = cloneThroughJson(point);
     */
}
