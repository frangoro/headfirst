package es.frangoro.headfirst.simuduck.strategy;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak, squeak!");
	}

}
