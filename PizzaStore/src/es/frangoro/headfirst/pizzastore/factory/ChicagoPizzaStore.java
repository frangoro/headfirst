package es.frangoro.headfirst.pizzastore.factory;

import es.frangoro.headfirst.pizzastore.product.ChicagoStyleCheesePizza;
import es.frangoro.headfirst.pizzastore.product.ChicagoStyleClamPizza;
import es.frangoro.headfirst.pizzastore.product.ChicagoStylePepperoniPizza;
import es.frangoro.headfirst.pizzastore.product.ChicagoStyleVeggiePizza;
import es.frangoro.headfirst.pizzastore.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza (String type) {
		
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else return null;
	}
}
