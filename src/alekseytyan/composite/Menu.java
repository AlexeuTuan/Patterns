package alekseytyan.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

    private final ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private Iterator<MenuComponent> iterator;

    private final String name;
    private final String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }



    @Override
    public Iterator<MenuComponent> iterator() {
        return iterator != null
                ? iterator
                : new CompositeIterator(menuComponents.iterator());
    }

    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
