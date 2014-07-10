/*
 * Using examples from Head First - Design Patterns
 */
package com.example.template_method.applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Armando
 */
public class MyApplet extends Applet {

    String message;

    @Override
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    @Override
    public void destroy() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }

}
