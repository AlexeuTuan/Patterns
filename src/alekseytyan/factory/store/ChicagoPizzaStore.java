package alekseytyan.factory.store;

import alekseytyan.factory.ingredient.PizzaIngredientFactory;
import alekseytyan.factory.ingredient.chicago.ChicagoPizzaIngredientFactory;
import alekseytyan.factory.pizzastyle.Pizza;
import alekseytyan.factory.pizzastyle.chicagostyle.ChicagoStyleCheesePizza;
import alekseytyan.factory.pizzastyle.chicagostyle.ChicagoStyleClamPizza;
import alekseytyan.factory.pizzastyle.chicagostyle.ChicagoStylePepperoniPizza;
import alekseytyan.factory.pizzastyle.chicagostyle.ChicagoStyleVeggiePizza;

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
