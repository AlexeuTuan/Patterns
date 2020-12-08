package factory.store;

import factory.ingredient.PizzaIngredientFactory;
import factory.ingredient.chicago.ChicagoPizzaIngredientFactory;
import factory.pizzastyle.Pizza;
import factory.pizzastyle.chicagostyle.ChicagoStyleCheesePizza;
import factory.pizzastyle.chicagostyle.ChicagoStyleClamPizza;
import factory.pizzastyle.chicagostyle.ChicagoStylePepperoniPizza;
import factory.pizzastyle.chicagostyle.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(ingredientFactory);
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza(ingredientFactory);
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza(ingredientFactory);
        }
        return pizza;
    }
}
