/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combined.djmvc;

/**
 *
 * @author Armando
 */
public class HeartTest {

    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
