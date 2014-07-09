/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.simple;

/**
 *
 * @author Armando
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.garageDoor = door;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();        
        garageDoor.up();
        garageDoor.stop();
        garageDoor.down();
        garageDoor.lightOff();
    }

}
