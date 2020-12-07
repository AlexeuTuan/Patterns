package factory;

import factory.pizzastyle.*;
import factory.pizzastyle.californiastyle.CaliforniaStyleCheesePizza;
import factory.pizzastyle.californiastyle.CaliforniaStyleClamPizza;
import factory.pizzastyle.californiastyle.CaliforniaStylePepperoniPizza;
import factory.pizzastyle.californiastyle.CaliforniaStyleVeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
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