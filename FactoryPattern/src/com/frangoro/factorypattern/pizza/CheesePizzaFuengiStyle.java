package com.frangoro.factorypattern.pizza;

import com.frangoro.factorypattern.pizza.Pizza;

public class CheesePizzaFuengiStyle extends Pizza {

    @Override
    public void prepare() {
        System.out.println("cheese fuengi");
    }

    @Override
    public void bake() {
        System.out.println("bake fuengi");
    }
}
