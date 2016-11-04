package es.frangoro.headfirst.weatherStation.observable;

import es.frangoro.headfirst.weatherStation.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
