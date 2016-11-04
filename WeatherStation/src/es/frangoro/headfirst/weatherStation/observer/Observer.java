package es.frangoro.headfirst.weatherStation.observer;

public interface Observer {
	public void update (float temp, float humidity, float pressure);
}
