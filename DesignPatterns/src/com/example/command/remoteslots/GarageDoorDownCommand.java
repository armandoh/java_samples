/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.remoteslots;


/**
 *
 * @author Armando
 */
public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor door) {
        this.garageDoor = door;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

}
