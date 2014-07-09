/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.macro;

/**
 *
 * @author Armando
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }

    @Override
    public void undo() {
        System.out.println("Undo!");
        for (Command cmd : commands) {
            cmd.undo();
        }

    }
}
