package Chapter02.list50;

import java.util.ArrayList;
import java.util.Iterator;

/*
Передача мутируемых объектов в немутируемый класс и возврат мути-
руемых объектов из него. Написать программу, которая передает мутируемый
объект в немутируемый класс и и возвращает его из немутируемого класса.
 */
public class Task50 {

    public class Radius {
        private int start;
        private int end;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }

    public final class neMut {
        private final int a;
        private final int b;
        private final  Radius radius;

        neMut(int aa, int bb, Radius radius){
            this.a = aa;
            this.b = bb;

            Radius clone = new Radius();
            clone.setEnd(radius.getEnd());
            clone.setStart(radius.getStart());

            this.radius = clone;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public Radius getRadius() {
            Radius clone = new Radius();
            clone.setStart(this.radius.getStart());
            clone.setEnd(this.radius.getEnd());
            return clone;
        }
    }

}
