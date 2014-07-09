/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.remoteslots;


/**
 *
 * @author Armando
 */
public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor door) {
        this.garageDoor = door;
    }

    @Override
    public void execute() {    
        garageDoor.up();
    }

}
