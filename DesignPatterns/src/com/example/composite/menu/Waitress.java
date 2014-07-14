/*
 * Using examples from Head First - Design Patterns
 */
package com.example.composite.menu;

/**
 *
 * @author Armando
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
