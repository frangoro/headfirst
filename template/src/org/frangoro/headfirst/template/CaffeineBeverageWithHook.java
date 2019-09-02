package org.frangoro.headfirst.template;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourCup();
        if (customerWantsCondiments())
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

    // Hook method. It could be either overrided or not in the subclass.
    boolean customerWantsCondiments() {
        return true;
    }

}

