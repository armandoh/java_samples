/*
 * Using examples from Head First - Design Patterns
 */

package com.example.command.undo;


/**
 *
 * @author Armando
 */
public interface Command {

    public void execute();
    public void undo();
    
}
