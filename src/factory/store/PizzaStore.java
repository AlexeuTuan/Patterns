package factory.store;

import factory.pizzastyle.DefaultPizza;
import factory.pizzastyle.Pizza;

public abstract class PizzaStore {

    protected Pizza pizza;


    public PizzaStore() {
        pizza = new DefaultPizza();
    }

    public Pizza orderPizza(String type) {
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
