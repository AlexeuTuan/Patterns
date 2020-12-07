package factory.store;

import factory.pizzastyle.Pizza;
import factory.SimplePizzaFactory;
import factory.pizzastyle.californiastyle.CaliforniaStyleCheesePizza;
import factory.pizzastyle.californiastyle.CaliforniaStyleClamPizza;
import factory.pizzastyle.californiastyle.CaliforniaStylePepperoniPizza;
import factory.pizzastyle.californiastyle.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    public CaliforniaPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza();
        }
        return pizza;
    }
}
