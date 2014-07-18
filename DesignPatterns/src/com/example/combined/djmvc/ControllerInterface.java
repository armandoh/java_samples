/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combined.djmvc;

/**
 *
 * @author Armando
 */
public interface ControllerInterface {

    void start();

    void stop();

    void increaseBPM();

    void decreaseBPM();

    void setBPM(int bpm);
}
