/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.observer;

/**
 *
 * @author Armando
 */
public interface QuackObservable {

    public void registerObserver(Observer observer);

    public void notifyObservers();

}
