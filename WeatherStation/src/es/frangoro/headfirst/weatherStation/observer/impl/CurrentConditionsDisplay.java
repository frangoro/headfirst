package es.frangoro.headfirst.weatherStation.observer.impl;

import java.util.Observable;
import java.util.Observer;

import es.frangoro.headfirst.weatherStation.observable.impl.WeatherData;
import es.frangoro.headfirst.weatherStation.observer.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private float pressure;
//	private Subject weatherData;
	private Observable observable;
	
	/*public CurrentConditionsDisplay (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}*/
	
	public CurrentConditionsDisplay (Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
	}

	/*@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}*/

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
