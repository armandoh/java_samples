/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.observer;

/**
 *
 * @author Armando
 */
public class DecoyDuck implements QuackObservable {

    Observable observable;

    public DecoyDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("<< Silence >>");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Decoy Duck";
    }

}
