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
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

        @Override
    public void update(Observable observable, Object obj) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.lastPressure = currentPressure;
            this.currentPressure = weatherData.getPressure();
            display();
        }

    }
    

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

}
