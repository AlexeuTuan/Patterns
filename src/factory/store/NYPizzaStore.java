package factory.store;

import factory.SimplePizzaFactory;
import factory.pizzastyle.*;
import factory.pizzastyle.nystyle.NYStyleCheesePizza;
import factory.pizzastyle.nystyle.NYStyleClamPizza;
import factory.pizzastyle.nystyle.NYStylePepperoniPizza;
import factory.pizzastyle.nystyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
