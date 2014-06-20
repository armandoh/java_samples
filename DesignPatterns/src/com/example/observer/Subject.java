/*
 * Using examples from Head First - Design Patterns
 */

package com.example.observer;

/**
 *
 * @author Armando
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    
}
