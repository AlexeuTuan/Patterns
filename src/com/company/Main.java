package com.company;

import factory.store.NYPizzaStore;
import factory.store.PizzaStore;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}