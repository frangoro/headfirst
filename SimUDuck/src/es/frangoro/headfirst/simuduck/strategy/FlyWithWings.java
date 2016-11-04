package es.frangoro.headfirst.simuduck.strategy;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can fly with wings.");
	}

}
