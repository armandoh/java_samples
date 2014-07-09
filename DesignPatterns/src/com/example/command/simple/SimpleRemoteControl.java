/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.simple;

/**
 *
 * @author Armando
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
