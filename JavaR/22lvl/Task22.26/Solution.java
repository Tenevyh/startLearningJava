/* 
Лазать, летать и бегать
Вот что тебе нужно сделать в этой задаче:
Внутри класса Solution создай интерфейс public interface CanFly (летать) с методом void fly().
Внутри класса Solution создай интерфейс public interface CanClimb (лазить по деревьям) с методом void climb().
Внутри класса Solution создай интерфейс public interface CanRun (бегать) с методом void run().
Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
Добавь интерфейсы классам Cat (кот), Dog (собака), Tiger (тигр), Duck (Утка).
*/

public class Solution {
    public interface CanFly{
        public void fly();
    }

    public interface CanClimb {
        public void climb();
    }

    public interface CanRun{
        public void run();
    }

    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb{
        public void run(){}
        public void climb(){}
    }

    public class Dog implements CanRun {
        public void run(){}
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly{
        public void fly(){}
        public void run(){}
    }
}