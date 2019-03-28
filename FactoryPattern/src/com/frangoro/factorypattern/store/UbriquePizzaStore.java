package com.frangoro.factorypattern.store;

import com.frangoro.factorypattern.pizza.BeaconPizza;
import com.frangoro.factorypattern.pizza.CheesePizzaUbriqueStyle;
import com.frangoro.factorypattern.pizza.Pizza;

public class UbriquePizzaStore extends  PizzaStore {

    Pizza pizza = null;

    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            pizza = new CheesePizzaUbriqueStyle();
        } else if ("".equals(type)) {
            pizza = new BeaconPizza();
        }

        return pizza;
    }
}
