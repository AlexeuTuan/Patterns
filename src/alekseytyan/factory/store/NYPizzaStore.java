package alekseytyan.factory.store;

import alekseytyan.factory.ingredient.PizzaIngredientFactory;
import alekseytyan.factory.ingredient.ny.NYPizzaIngredientFactory;
import alekseytyan.factory.pizzastyle.*;
import alekseytyan.factory.pizzastyle.nystyle.NYStyleCheesePizza;
import alekseytyan.factory.pizzastyle.nystyle.NYStyleClamPizza;
import alekseytyan.factory.pizzastyle.nystyle.NYStylePepperoniPizza;
import alekseytyan.factory.pizzastyle.nystyle.NYStyleVeggiePizza;

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
