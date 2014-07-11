/*
 * Using examples from Head First - Design Patterns
 */
package com.example.iterator.menuIt.improved;

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

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position - 1] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
