package com.frangoro.factorypattern.pizza;

import com.frangoro.factorypattern.pizza.Pizza;

public class CheesePizzaUbriqueStyle extends Pizza {


    @Override
    public void prepare() {
        System.out.println("cheese payoyo");
    }

    @Override
    public void bake() {
        super.bake();
    }
}
