package es.frangoro.headfirst.weatherStation.observable.impl;

public class WeatherData /*implements Subject*/ extends java.util.Observable {

	private float temp;
	private float humidity;
	private float pressure;
//	private List<Observer> observers;
	
	public WeatherData () {
//		observers = new ArrayList<Observer>();
	}
	
	/*@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer o: observers) {
			o.update(temp, humidity, pressure);
		}
	}*/

	public void measurementsCahged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements (float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsCahged();
	}
	
	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
