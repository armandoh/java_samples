/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.undo;

/**
 *
 * @author Armando
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

}
