package org.frangoro.headfirst.adapter.test;

import org.frangoro.headfirst.adapter.adapter.TurkeyAdapter;
import org.frangoro.headfirst.adapter.bean.*;

public class DuckTestDrive {

    public static void main (String[] args) {

        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        Duck fakeDuck = new TurkeyAdapter(turkey);

        testDuck(duck);
        testDuck(fakeDuck);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
