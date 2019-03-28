package com.frangoro.factorypattern.pizza;

public class ChicagoStyleVeggieiPizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
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
