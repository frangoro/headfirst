package es.frangoro.headfirst.starbuzz.component;

public class HoseBlend extends Beverage{

	public HoseBlend () {
		description = "HoseBlend";
	}
	
	@Override
	public double cost() {
		return .89;
	}

}
