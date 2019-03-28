package com.frangoro.factorypattern.pizza;

import com.frangoro.factorypattern.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory pif;

    CheesePizza (PizzaIngredientFactory pif) {
        this.pif = pif;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        pif.createDough();
        System.out.println("Adding sauce ");
        System.out.println("Adding toppings: ");
        for (String topping:toppings) {
            System.out.println("  " + topping);
        }
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public void box() {
        super.box();
        System.out.println(this.getClass().getSimpleName());
    }
}
