package alekseytyan.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }


    @Override
    public boolean hasNext() {
        if(stack.isEmpty()) return false;

        Iterator<MenuComponent> iterator = stack.peek();
        if(!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        } else {
            return true;
        }
    }

    @Override
    public MenuComponent next() {
        if(hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();

            MenuComponent component = iterator.next();

            stack.push(component.iterator());

            return component;
        }
        return null;
    }
}
