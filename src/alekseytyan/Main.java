package alekseytyan;

import alekseytyan.adapter.*;
import com.sun.xml.internal.messaging.saaj.util.TeeInputStream;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();

        Turkey turkeyAdapter = new TurkeyAdapter(duck1);
        testTurkey(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}