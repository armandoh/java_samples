/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.remoteslots;

/**
 *
 * @author Armando
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Nothing to do!");
    }

}
