package es.frangoro.headfirst.weatherStation.client;

import es.frangoro.headfirst.weatherStation.observable.impl.WeatherData;
import es.frangoro.headfirst.weatherStation.observer.impl.CurrentConditionsDisplay;
import es.frangoro.headfirst.weatherStation.observer.impl.HeatIndexDisplay;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		//HeatIndexDisplay hid = new HeatIndexDisplay(weatherData);
		// weatherData.registerObserver(ccd);
		weatherData.setMeasurements(90, 50, 0);
	}
}
