/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.macro;


/**
 *
 * @author Armando
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }

}
