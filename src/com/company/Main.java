package com.company;

import factory.store.NYPizzaStore;
import factory.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}