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
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();

        // We want use a goose like a duck
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks());
    }

    void simulate (Quackable duck) {
        duck.quack();
    }
}
