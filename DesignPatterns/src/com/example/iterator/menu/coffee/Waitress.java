/*
 * Using examples from Head First - Design Patterns
 */
package com.example.iterator.menu.coffee;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Armando
 */
public class Waitress {

    private List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();

        while (menuIterator.hasNext()) {
            printMenu(menuIterator.next().createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
