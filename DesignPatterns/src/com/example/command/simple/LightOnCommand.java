/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.simple;

/**
 *
 * @author Armando
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
