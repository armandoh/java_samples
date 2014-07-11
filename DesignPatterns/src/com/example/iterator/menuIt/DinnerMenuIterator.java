/*
 * Using examples from Head First - Design Patterns
 */
package com.example.iterator.menuIt;

import java.util.Iterator;

/**
 *
 * @author Armando
 */
public class DinnerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    /*
    //If Iterator is not parameterized with MenuItem type then use this method
    @Override
    public Object next() {

        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
    */

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

}
