package org.frangoro.headfirst.template;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boil the water");
    }

    void pourCup() {
        System.out.println("Pour it in the cup");
    }
}

