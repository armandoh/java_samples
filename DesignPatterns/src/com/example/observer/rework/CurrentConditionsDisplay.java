/*
 * Using examples from Head First - Design Patterns
 */
package com.example.observer.rework;

import com.example.observer.DisplayElement;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Armando
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " %humidity");
    }

    @Override
    public void update(Observable observable, Object obj) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }

}
