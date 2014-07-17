/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Armando
 */
public class Observable implements QuackObservable {

    private List<Observer> observers = new ArrayList<>();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }

    public Iterator getObservers() {
        return observers.iterator();
    }

}
