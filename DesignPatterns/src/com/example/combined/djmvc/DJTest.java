/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combined.djmvc;

/**
 *
 * @author Armando
 */
public class DJTest {

    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
