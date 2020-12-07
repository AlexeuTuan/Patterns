package factory.store;

import factory.pizzastyle.DefaultPizza;
import factory.pizzastyle.Pizza;
import factory.SimplePizzaFactory;

public abstract class PizzaStore {

    SimplePizzaFactory factory;
    protected Pizza pizza;


    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
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
