package com.company;

import factory.pizzastyle.Pizza;
import factory.store.NYPizzaStore;
import factory.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
    }
}