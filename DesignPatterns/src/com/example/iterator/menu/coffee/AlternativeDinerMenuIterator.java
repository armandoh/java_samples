/*
 * Using examples from Head First - Design Patterns
 */
package com.example.iterator.menu.coffee;

import java.util.Calendar;
import java.util.Iterator;

/**
 *
 * @author Armando
 */
public class AlternativeDinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    private int position = 0;

    public AlternativeDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }

}
