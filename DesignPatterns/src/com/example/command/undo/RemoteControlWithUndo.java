/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.undo;



/**
 *
 * @author Armando
 */
public class RemoteControlWithUndo {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    
    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
        }
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
        }
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot ").append(i).append("]").append(onCommands[i].getClass().getName());
            sb.append("  ").append(offCommands[i].getClass().getName()).append("\n");
        }

        return sb.toString();
    }

}
