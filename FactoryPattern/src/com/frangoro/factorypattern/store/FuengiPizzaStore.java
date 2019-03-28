package com.frangoro.factorypattern.store;

import com.frangoro.factorypattern.pizza.BeaconPizza;
import com.frangoro.factorypattern.pizza.CheesePizzaFuengiStyle;
import com.frangoro.factorypattern.pizza.Pizza;

public class FuengiPizzaStore extends  PizzaStore {

    Pizza pizza = null;

    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            pizza = new CheesePizzaFuengiStyle();
        } else {
            pizza = new BeaconPizza();
        }

        return pizza;
    }
}
