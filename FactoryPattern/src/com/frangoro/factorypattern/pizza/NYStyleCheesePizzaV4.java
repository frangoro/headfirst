package com.frangoro.factorypattern.pizza;

import com.frangoro.factorypattern.ingredient.PizzaIngredientFactory;

public class NYStyleCheesePizzaV4 extends Pizza {

    PizzaIngredientFactory pif;

    public NYStyleCheesePizzaV4 (PizzaIngredientFactory pif) {
        this.pif = pif;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = pif.createDough();
        sauce = "NY cheese sauce";
        toppings.add("Tomato");
        toppings.add("Onions");
    }

    @Override
    public void cut() {
        System.out.println("NY Style cut");
    }
}
