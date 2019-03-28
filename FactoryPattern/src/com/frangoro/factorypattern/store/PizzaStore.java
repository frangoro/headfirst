package com.frangoro.factorypattern.store;

import com.frangoro.factorypattern.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza (String type);
}
