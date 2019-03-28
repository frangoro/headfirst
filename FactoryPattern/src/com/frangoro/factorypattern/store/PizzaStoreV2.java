package com.frangoro.factorypattern.store;

import com.frangoro.factorypattern.pizza.Pizza;

public class PizzaStoreV2 {

    SimplePizzaFactory spf;

    public PizzaStoreV2(SimplePizzaFactory spf) {
        this.spf = spf;
    }

    public Pizza orderPizza(String type) {

        Pizza pizza = spf.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // We have encapsulated what use to change into SimplePizzaFactory
}
