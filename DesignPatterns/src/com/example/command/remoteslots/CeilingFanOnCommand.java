/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.remoteslots;


/**
 *
 * @author Armando
 */
public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

}
