/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.remoteslots;


/**
 *
 * @author Armando
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

}
