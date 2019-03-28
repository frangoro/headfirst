package com.frangoro.factorypattern.store;

import com.frangoro.factorypattern.pizza.CheesePizza;
import com.frangoro.factorypattern.pizza.PepperoniPizza;
import com.frangoro.factorypattern.pizza.Pizza;

public class PizzaStoreV1 {

    public enum Type {
        CHEESE, PEPPERONI, CLAM, VEGGIE
    }

    public Pizza orderPizza(Type type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public Pizza createPizza(Type type) {

        switch (type) {
            case CHEESE:
                return new CheesePizza();
            case PEPPERONI:
                return new PepperoniPizza();
            case CLAM:
                return new PepperoniPizza();
            case VEGGIE:
                return new PepperoniPizza();
            default:
                return new CheesePizza();
        }

    }
}
