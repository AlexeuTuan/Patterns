package alekseytyan.iterator;

import java.util.Iterator;

public class DinerMenuMyIterator implements Iterator<MenuItem> {

    private final MenuItem[] list;
    private int position;

    public DinerMenuMyIterator(MenuItem[] list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public MenuItem next() {
        return list[position++];
    }

    @Override
    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
        }
        if (list[position-1] != null) {
            for (int i = position-1; i < (list.length-1); i++) {
                list[i] = list[i+1];
            }
            list[list.length-1] = null;
        }
    }
}