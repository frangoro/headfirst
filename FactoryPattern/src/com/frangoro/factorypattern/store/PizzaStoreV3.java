package com.frangoro.factorypattern.store;

import com.frangoro.factorypattern.pizza.Pizza;

public abstract class PizzaStoreV3 {

    public final Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // Factory method is abstract to delegate in subclasses.
    // It isolates creation from client (PizzaStore).
    public abstract Pizza createPizza(String type);
}
