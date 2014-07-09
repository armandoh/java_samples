/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.macro;


/**
 *
 * @author Armando
 */
public class TVOffCommand implements Command {

    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }

}
