/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.macro;

/**
 *
 * @author Armando
 */
public class HottubOffCommand implements Command {

    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }

}
