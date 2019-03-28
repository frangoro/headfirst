package com.frangoro.factorypattern.pizza;

import com.frangoro.factorypattern.ingredient.Dough;
import com.frangoro.factorypattern.ingredient.PizzaIngredientFactory;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    Dough dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Standard bake");
    }

    public void cut() {
        System.out.println("Standard cut");
    }

    public void box() {
        System.out.println("Standard box");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
