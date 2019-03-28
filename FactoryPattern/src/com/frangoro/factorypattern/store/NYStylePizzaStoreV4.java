package com.frangoro.factorypattern.store;

import com.frangoro.factorypattern.ingredient.NYPizzaIngredientFactory;
import com.frangoro.factorypattern.ingredient.PizzaIngredientFactory;
import com.frangoro.factorypattern.pizza.*;

public class NYStylePizzaStoreV4 extends  PizzaStoreV3 {

    Pizza pizza = null;
    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "CHEESE":
                pizza = new NYStyleCheesePizzaV4(pizzaIngredientFactory);
                pizza.setName("NY Style Cheese Pizza");
                return new NYStyleCheesePizza();
            case "PEPPERONI":
                return new NYStylePepperoniPizza();
            case "CLAM":
                return new NYStyleClamPizza();
            case "VEGGIE":
                return new NYStyleVeggieiPizza();
            default:
                return new NYStyleCheesePizza();
        }
    }
}
