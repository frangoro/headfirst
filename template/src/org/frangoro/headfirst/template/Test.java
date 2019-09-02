package org.frangoro.headfirst.template;

public class Test {
    public static void main (String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}
