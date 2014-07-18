/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combined.djmvc;

/**
 *
 * @author Armando
 */
public interface HeartModelInterface {

    int getHeartRate();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
