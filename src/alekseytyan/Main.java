package alekseytyan;

import alekseytyan.adapter.duckadapter.Duck;
import alekseytyan.adapter.duckadapter.MallardDuck;
import alekseytyan.adapter.duckadapter.Turkey;
import alekseytyan.adapter.duckadapter.TurkeyAdapter;
import alekseytyan.adapter.iteratoradapter.EnumerationAdapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add("string one");
        testList.add("string two");
        testList.add("string three");
        testList.add("string four");

        Enumeration<String> enumeration = new EnumerationAdapter<>(testList.iterator());

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}