/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.macro;




/**
 *
 * @author Armando
 */
public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }

}
