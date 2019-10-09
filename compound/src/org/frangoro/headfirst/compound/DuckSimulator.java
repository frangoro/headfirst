package org.frangoro.headfirst.compound;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        // Factory to do the creation
        AbstractDuckFactory factory = new DuckFactory();
        simulator.simulate(factory);
    }

    void simulate(AbstractDuckFactory factory) {

        // Decorte ducks to count quacks
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();

        // We want use a goose like a duck
        Quackable goose = new GooseAdapter(new Goose());

        // Create a flock
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(goose);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallardDuck1 = factory.createMallardDuck();
        Quackable mallardDuck2 = factory.createMallardDuck();
        Quackable mallardDuck3 = factory.createMallardDuck();
        Quackable mallardDuck4 = factory.createMallardDuck();
        flockOfMallards.add(mallardDuck1);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(mallardDuck3);
        flockOfMallards.add(mallardDuck4);
        flockOfDucks.add(flockOfMallards);

        // Create Observer
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("\nDuck Simulator: With Observer");
        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks());
    }

    void simulate (Quackable duck) {
        duck.quack();
    }
}
