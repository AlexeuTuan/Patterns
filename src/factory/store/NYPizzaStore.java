package factory.store;

import factory.ingredient.PizzaIngredientFactory;
import factory.ingredient.ny.NYPizzaIngredientFactory;
import factory.pizzastyle.*;
import factory.pizzastyle.nystyle.NYStyleCheesePizza;
import factory.pizzastyle.nystyle.NYStyleClamPizza;
import factory.pizzastyle.nystyle.NYStylePepperoniPizza;
import factory.pizzastyle.nystyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new NYStyleVeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new NYStyleClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
